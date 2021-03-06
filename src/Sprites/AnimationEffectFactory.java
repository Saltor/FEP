/*
 * Copyright 2012 Kyle Buzsaki. All Rights Reserved.
 */
package Sprites;

import Game.Sound.SoundManager;

public class AnimationEffectFactory {
    
    public static AnimationEffect newHealSmall() {
        return new AnimationEffect("resources/animations/healSmall.png", 27, generateSequence(27), SoundManager.heal);
    }
    
    public static int[][] generateSequence(int maxFrames) {
        int[][] sequence = new int[1][maxFrames];
        
        for(int i = 0; i < maxFrames; i++)
        {
            sequence[0][i] = i;
        }
        
        return sequence;
    }
}
