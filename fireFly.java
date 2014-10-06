
FireFly redFireFly;
FireFly greenFireFly;
FireFly blueFireFly;
FireFly cyanFireFly;

void setup() {
  size(500,500);
  background(30,3,55);
  smooth();
  
 float randPos = random(500);

  redFireFly = new FireFly(color(255,0,0),randPos,randPos,20);
  greenFireFly = new FireFly(color(0,255,0),randPos,randPos,2);
  blueFireFly = new FireFly(color(0,0,255),randPos,randPos,2);
  cyanFireFly = new FireFly(color(73,195,250),randPos,randPos,2);
}

void draw() {
  noStroke();
  fill(30,3,55,18);
  rect(0,0, width, height);
  
  redFireFly.fly();
  redFireFly.display();
  greenFireFly.fly();
  greenFireFly.display();
  blueFireFly.fly();
  blueFireFly.display();
  cyanFireFly.fly();
  cyanFireFly.display();
}

class FireFly {
  color c;
  float xpos;
  float ypos;
  float xspeed;

  FireFly(color tempC, float tempXpos, float tempYpos, float tempXspeed) {
    c = tempC;
    xpos = tempXpos;
    ypos = tempYpos;
    xspeed = tempXspeed;
  }

  void display() {
    fill(c);
    ellipse(xpos,ypos,random(15,30),random(15,30));
  }

  void fly() {
    xpos = xpos + random(5);
    ypos = ypos + random(5);
    if (xpos > width + 30) {
      xpos = random(500);
    }
    if (ypos > height + 30) {
      ypos = random(500);
    }
  }
}