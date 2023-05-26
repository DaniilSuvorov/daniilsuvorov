package day11.task2;

public class Paladin extends Hero implements Healer,PhysAttack{
    public Paladin(){
        setHealth(100);
        setMagicDef(0.2);
        setPhysDef(0.5);
        setPhysAtt(15);

    }
    @Override
    public void healHimself() {
        if (getHealth() + 25 <= 100){
            setHealth(getHealth() + 25);
        } else {
           setHealth(100);
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.getHealth() + 10 <= 100){
            hero.setHealth(hero.getHealth() + 10);
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
        return "Paladin{" +
                "Health=" + getHealth() +
                '}';
    }
}
