public class App {
    public static void main(String[] args) throws Exception {
        SingleTable t1 = new SingleTable(4, 60, 74);
        SingleTable t2 = new SingleTable(8, 70, 74);
        SingleTable t3 = new SingleTable(12, 75, 76);

        CombinedTable c1 = new CombinedTable(t1, t2); //COMMENT: A CombinedTable is composed of two SingleTable objects. 
        System.out.println(c1.canSeat(9)); //RETURN: true COMMENT:Since its two single tables have a total of 12 seats, c1 can seat 10 or fewer people.
        System.out.println(c1.canSeat(11)); //RETURN: false  COMMENT: c1 cannot seat 11 people.
        System.out.println(c1.getDesirability()); //RETURN: 65.0 COMMENT: Because c1’s two single tables are the same height, its desirability is the average of 60.0 and 70.0. 
        CombinedTable c2 = new CombinedTable(t2, t3);  //COMMENT: A CombinedTable is composed of two SingleTable objects.
        System.out.println(c2.canSeat(18)); //RETURN: true COMMENT: Since its two single tables have a total of 20 seats, c2 can seat 18 or fewer people.
        System.out.println(c2.getDesirability()); //RETURN: 62.5 COMMENT: Because c2’s two single tables are not the same height, its desirability is 10 units less than the average of 70.0 and 75.0
        t2.setViewQuality(80); //COMMENT: Changing the view quality of one of the tables that makes up c2 changes the desirability of c2, as illustrated in the next line of the chart. Since setViewQuality is a SingleTable method, you do not need to write it. 
        System.out.println(c2.getDesirability()); //RETURN: 67.5 COMMENT: Because the view quality of t2 changed, the desirability of c2 has also changed.


    }
}
