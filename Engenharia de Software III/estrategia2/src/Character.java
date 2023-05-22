import minhaInterface.AttackStrategy;


class Character {
    private AttackStrategy attackStrategy;

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void attack() {
        if (attackStrategy != null) {
            attackStrategy.attack();
        }
    }
}