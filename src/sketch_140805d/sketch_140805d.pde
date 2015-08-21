void setup() {
  size(800, 800);
  background(0,32,153);
}

void draw() {
  
   //2. make it a nice color
   fill(153,221,221);
   

   //3. if the mouse is pressed, fill the circle with a different color
   if(mousePressed)
   {
     fill(0,153,119);
   }
   //1. draw an ellipse
ellipse(400,400,500,500);

}
// Copyright Wintriss Technical Schools 2013




