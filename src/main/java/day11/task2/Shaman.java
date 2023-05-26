package day11.task2;

public class Shaman extends Hero implements Healer,PhysAttack,MagicAttack{
     private int magicAtt = 20;
    public Shaman(){
        setHealth(100);
        setMagicDef(0.2);
        setPhysDef(0.2);
        setPhysAtt(10);
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
    public void healHimself() {
        if (getHealth() + 50 <= 100){
            setHealth(getHealth() + 50);
        } else {
            setHealth(100);
        }

    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.getHealth() + 30 <= 100){
            hero.setHealth(hero.getHealth() + 30);
        } else {
            hero.setHealth(100);
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
        return "Shaman{" +
                "Health=" + getHealth() +
                '}';
    }

    public int getMagicAtt() {
        return magicAtt;
    }
}

