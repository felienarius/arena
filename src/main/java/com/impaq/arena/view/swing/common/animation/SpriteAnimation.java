package com.impaq.arena.view.swing.common.animation;

import com.impaq.arena.view.swing.common.BaseAnimation;
import com.impaq.arena.view.swing.common.Interpolator;
import com.impaq.arena.view.swing.common.LinearInterpolator;
import com.impaq.arena.view.swing.common.Sprite;
import com.impaq.arena.view.swing.common.Stage;

/**
 *
 * @author jaro
 */
public class SpriteAnimation extends BaseAnimation {

    private final Sprite sprite;

    private final Interpolator interpolator;

    public SpriteAnimation(Stage stage, Sprite sprite, long duration) {
        this(stage, sprite, duration, new LinearInterpolator());
    }

    public SpriteAnimation(Stage stage, Sprite sprite, long duration, Interpolator interpolator) {
        super(stage, duration);
        this.sprite = sprite;
        this.interpolator = interpolator;
    }

    @Override
    protected void updateValue(double l) {
        sprite.updateIndex((int) interpolator.interpolate(0, sprite.size(), l));
    }

}