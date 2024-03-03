abstract class Entity {
    //---Fields---
    private String name;
    private int force;
    private int hp;
    private boolean destroyed;

    public Entity(){}
    public Entity(String name) {
        this.name = name;
    }
    public Entity(String name, int force){
        this.name = name;
        this.force = force;
    }

    protected int getForce(){
        return force;
    }

    public boolean isDestroyed(){
        return destroyed;
    }

    protected boolean damage(int dhp){
        hp -= dhp;
        if (hp < 0){
            destroyed = true;
            System.out.println("Entity " + name + " was destroyed");
            return true;
        }
        return false;
    }
}
