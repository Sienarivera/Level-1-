// Copyright Wintriss Technical Schools 2013


int coordinate=0;

void setup() {
  size(800, 200);


}

void draw() {
 
 fill(255,119,170);
 
     if(mousePressed)
     {
       fill(255,204,255);
     }

      coordinate+=50;
 
ellipse(coordinate,100,100,100);

//6. Make your dot move really fast so that it can win the race (you have to figure out what part of your code to change)

//7. Use this method to play a ding when your dot crosses the finish line. 

if(coordinate>800)
{
  playSound();
}
}

import ddf.minim.*;
boolean soundPlayed = false;
void playSound() {
  if (!soundPlayed) {
    Minim minim = new Minim(this);        
    AudioSample sound = minim.loadSample("221567__alaskarobotics__cheering-and-clapping-crowd-2.wav");
    sound.trigger();
    soundPlayed = true;
  }
}

