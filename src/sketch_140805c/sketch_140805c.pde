void setup()
{
  size(1278,1278);
  background(102, 238, 221);
}


void draw()
{
  println(mouseY);
  
  triangle(mouseY,70,987,1028,1234,932);
 
  text("something",100,1234);

  if (mousePressed)
  {
    fill(0, 230, 0);
  }
  else
  {
    fill(119, 170, 255);
  }
}

