import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level4 extends World
{
    /**
     * Constructor for objects of class level4.
     * 
     */
    public static int lv4=0;
    public level4()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1160, 600, 1);
        prepare();
        }
    
    public void prepare()
    {
        pintu pintu = new pintu();
        addObject(pintu,64*11,600-64);
        gergaji gergaji = new gergaji();
        addObject(gergaji,580,600-70);
        gergaji gergaji2 = new gergaji();
        addObject(gergaji2,64*11+2,600-160);
        player player = new player();
        addObject(player,55,440);
        duri duri = new duri();
        addObject(duri,0,600-15);
        duri duri2 = new duri();
        addObject(duri2,64,600-15);
        duri duri3 = new duri();
        addObject(duri3,64*2,600-15);
        duri duri4 = new duri();
        addObject(duri4,64*3,600-15);
        duri duri5 = new duri();
        addObject(duri5,64*4,600-15);
        duri duri6 = new duri();
        addObject(duri6,64*5,600-15);
        duri duri7 = new duri();
        addObject(duri7,64*6,600-15);
        duri duri8 = new duri();
        addObject(duri8,64*7,600-15);
        duri duri9 = new duri();
        addObject(duri9,64*8,600-15);
        rumput rumput10 = new rumput();
        addObject(rumput10,64*9,600);
        rumput rumput11 = new rumput();
        addObject(rumput11,64*10,600);
        rumput rumput12 = new rumput();
        addObject(rumput12,64*11,600);
        rumput rumput13 = new rumput();
        addObject(rumput13,64*12,600);
        rumput rumput14 = new rumput();
        addObject(rumput14,64*13,600);
        rumput rumput15 = new rumput();
        addObject(rumput15,64*14,600);
        rumput rumput28 = new rumput();
        addObject(rumput28,64*15,600);
        rumput rumput29 = new rumput();
        addObject(rumput29,64*16,600);
        rumput rumput30 = new rumput();
        addObject(rumput30,64*17,600);
        rumput rumput31 = new rumput();
        addObject(rumput31,64*18,600);
        kunci kunci = new kunci();
        addObject(kunci,64*3,600-64*2);

        rumput rumput16 = new rumput();
        addObject(rumput16,0,536);
        rumput rumput17 = new rumput();
        addObject(rumput17,64,536);
        rumput rumput18 = new rumput();
        addObject(rumput18,384,536);
        rumput rumput27 = new rumput();
        addObject(rumput27,448,536);
        rumput rumput22 = new rumput();
        addObject(rumput22,512,408+64);
        rumput rumput23 = new rumput();
        addObject(rumput23,640,408);
        rumput rumput20 = new rumput();
        addObject(rumput20,192,536);
        rumput rumput19 = new rumput();
        addObject(rumput19,64*12,600-64*4);
        tombol tombol = new tombol();
        addObject(tombol,64*12,600-64*5);
    }
}