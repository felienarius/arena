package com.impaq.arena.engine.event;

import com.impaq.arena.player.Player;

/**
 *
 * @author Jaroslaw Herod <jaroslaw.herod@impaqgroup.com>
 */
public class DestroyCastle extends BaseActionEvent {

    public DestroyCastle(Player oponent, int value) {
        super(oponent, value);
    }

}