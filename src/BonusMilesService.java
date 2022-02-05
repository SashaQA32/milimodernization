public class BonusMilesService {
    public int calculate(int cost) {
        int oneMile = 20;
        int bonus = cost / oneMile;
        return bonus;
    }
}
