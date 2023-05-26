package day11.task2;

public class Magician extends Hero implements PhysAttack,MagicAttack{
    private int magicAtt = 20;
    public Magician(){
        setHealth(100);
        setMagicDef(0.8);
        setPhysDef(0);
        setPhysAtt(5);
    }
    @Override
    public void magicalAttack(Hero hero) {
        if((hero.getHealth()-getMagicAtt())+(getMagicAtt() * hero.getMagicDef()) >= 0) {
            hero.setHealth((hero.getHealth()-getMagicAtt())+(getMagicAtt() * hero.getMagicDef()));
        } else {
            hero.setHealth(0);
        }

    }

    @Override
    public void physicalAttack(Hero hero) {
        if((hero.getHealth()-getPhysAtt())+(getPhysAtt() * hero.getPhysDef()) >= 0) {
            hero.setHealth((hero.getHealth() - getPhysAtt()) + (getPhysAtt() * hero.getPhysDef()));
        } else {
            hero.setHealth(0);
        }

    }
    public String toString(){
        return "Magician{" +
                "Health=" + getHealth() +
                '}';
    }

    public int getMagicAtt() {
        return magicAtt;
    }
}
