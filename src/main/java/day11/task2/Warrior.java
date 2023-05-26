package day11.task2;

public class Warrior extends Hero implements PhysAttack{
    public Warrior(){
        setPhysAtt(30);
        setHealth(100);
        setPhysDef(0.8);
        setMagicDef(0);

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
        return "Warrior{" +
                "Health=" + getHealth() +
                '}';
    }
}
