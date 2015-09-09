//// Wild circles #1.

// GLOBAL VARIABLES //
float x,y;

// Setup:  screen size, initialization. //
void setup() {
  size(500, 500);        // Try changing the width & height.
  x=  width/3;
  y=  height/2.5;
}

// Next frame:  draw three circles. //
void draw() {
  ellipse(x, y, 180, 180);
  ellipse(x+45, y+45, 60, 60);
  ellipse(x+30, y+30, 50, 50);
 
  // Move them???? //--              
  x=  x + 2;  y=  y + 1;
  // Insert BREAK here ^
  // to uncomment the above code,
}
