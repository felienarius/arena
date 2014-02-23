package com.impaq.arena;

import com.google.common.eventbus.EventBus;
import com.impaq.arena.engine.event.BuildCastle;
import com.impaq.arena.engine.event.DestroyCastle;
import com.impaq.arena.engine.event.KillBuilders;
import com.impaq.arena.engine.event.KillWarriors;
import com.impaq.arena.engine.event.KillWizards;
import com.impaq.arena.engine.event.AddBuilders;
import com.impaq.arena.engine.event.AddWarriors;
import com.impaq.arena.engine.event.AddWizards;
import com.impaq.arena.engine.event.SpyBuilders;
import com.impaq.arena.engine.event.SpyCastle;
import com.impaq.arena.engine.event.SpyWarriors;
import com.impaq.arena.engine.event.SpyWizards;
import com.impaq.arena.player.Player;

public abstract class RoundStrategy {

    private static int POPULATE_NUMBER = 5;
    private Player current;
    private Player oponent;
    private int actionCount = 0;
    private int spyActionCount = 0;
    private EventBus eventBus;
    private int addActionCount = 0;

    protected abstract void body();

    void execute(EventBus eventBus, Player current, Player oponent) {
        this.current = current;
        this.oponent = oponent;
        this.eventBus = eventBus;
        actionCount = 0;
        spyActionCount = 0;
        addActionCount = 0;
        body();
    }

    private void dispatchEvent(Object object) {
        eventBus.post(object);
    }

    protected void killWizzards() {
        if (!isActionAvailable()) {
            return;
        }

        dispatchEvent(new KillWizards(current, getWizardsStrength()));
        oponent.getWizards().kill(getWizardsStrength());
        actionCount++;
    }

    protected void killWarriors() {
        if (!isActionAvailable()) {
            return;
        }
        oponent.getWarriors().kill(getWizardsStrength());
        dispatchEvent(new KillWarriors(current, getWizardsStrength()));
        actionCount++;
    }

    protected void killBuilders() {
        if (!isActionAvailable()) {
            return;
        }

        oponent.getBuilders().kill(getWizardsStrength());
        dispatchEvent(new KillBuilders(current, getWizardsStrength()));
        actionCount++;
    }

    protected void destroyCastle() {
        if (!isActionAvailable()) {
            return;
        }
        oponent.getCastle().destroy(getWarriorsStrength());
        dispatchEvent(new DestroyCastle(current, getWarriorsStrength()));
        actionCount++;
    }

    protected void buildCastle() {
        if (!isActionAvailable()) {
            return;
        }
        current.getCastle().expand(getBuildersProductivity());
        dispatchEvent(new BuildCastle(current, getBuildersProductivity()));
        actionCount++;
    }

    protected void addBuilders() {
        if (!isAddAvailable()) {
            return;
        }
        current.getBuilders().add(1);
        dispatchEvent(new AddBuilders(oponent, 1));
        addActionCount++;
    }

    protected void addWizzards() {
        if (!isAddAvailable()) {
            return;
        }
        current.getWizards().add(1);
        dispatchEvent(new AddWizards(current, 1));
        addActionCount++;
    }

    protected void addWarriors() {
        if (!isAddAvailable()) {
            return;
        }
        current.getWarriors().add(2);
        dispatchEvent(new AddWarriors(current, 2));
        addActionCount++;
    }

    private boolean isActionAvailable() {
        return actionCount < 1;
    }

    private int getWizardsStrength() {
        return current.getWizards().getStrength();
    }

    private int getWarriorsStrength() {
        return current.getWarriors().getStrength();
    }

    private int getBuildersProductivity() {
        return current.getBuilders().getProductivity();
    }

    protected long spyCastle() {
        if (!isSpyActionAvailable()) {
            return -1;
        }
        dispatchEvent(new SpyCastle(oponent));
        spyActionCount++;
        return oponent.getCastle().spy();
    }

    protected long spyWarriors() {
        if (!isSpyActionAvailable()) {
            return -1;
        }
        dispatchEvent(new SpyWarriors(oponent));
        spyActionCount++;
        return oponent.getWarriors().spy();
    }

    protected long spyWizzards() {
        if (!isSpyActionAvailable()) {
            return -1;
        }
        dispatchEvent(new SpyWizards(oponent));

        spyActionCount++;
        return oponent.getWizards().spy();
    }

    protected long spyBuilders() {

        if (!isSpyActionAvailable()) {
            return -1;
        }
        dispatchEvent(new SpyBuilders(oponent));
        spyActionCount++;
        return oponent.getBuilders().spy();
    }

    private boolean isSpyActionAvailable() {
        return spyActionCount < 2;
    }

    protected long castle() {
        return current.getCastle().getHeight();
    }

    protected long warriors() {
        return current.getWarriors().getCount();
    }

    protected long wizzards() {
        return current.getWizards().getCount();
    }

    protected long builders() {
        return current.getBuilders().getCount();
    }

    private boolean isAddAvailable() {
        return addActionCount < 2;
    }
}
