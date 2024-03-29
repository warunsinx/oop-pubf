public class Player {
    // attrb
    protected int xLoc;
    protected int yLoc;
    protected int health;
    protected String name;
    protected int attackDamage;
    protected int attackRange;

    public Player(int x, int y, String n) {
        // Please implement this
        this.xLoc = x;
        this.yLoc = y;
        this.health = 1;
        this.name = n;
        this.attackDamage = 1;
        this.attackRange = 1;

    }

    public void print() {
        // Please implement this
        System.out.print(this.name.charAt(0)); // charAt -> choose the letter in first array
    }

    public String getName() {
        // Please implement this
        return this.name;
    }

    public void move(int maxX, int maxY) {
        // Please implement this
        if (xLoc < maxX - 1) {
            xLoc += 1;
        } else if (yLoc < maxY - 1) {
            yLoc += 1;
        }
    }

    public boolean isAlive() {
        // Please implement this
        return health > 0 ? true : false;
    }

    public boolean isAt(int i, int j) {
        // Please implement this
        if (this.xLoc == i && this.yLoc == j) {
            return true;
        } else
            return false;
    }

    public int getX() {
        return xLoc;
    }

    public int getY() {
        return yLoc;
    }

    public void setHealth(int n) {
        health = n;
    }

    public int getHealth() {
        return this.health;
    }

    public int getAtkDmg() {
        return this.attackDamage;
    }

    public int getAtkRange() {
        return this.attackRange;
    }
}
