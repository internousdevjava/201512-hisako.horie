/**
 *
 */

/**
 * @author internous
 *
 */
public class Exercise03{
  public static void main(String[] args){
	  Goods.setRate(0.05);
//
    Goods s = new Goods("千葉県産 スイカ(M)",980);
    Goods b = new Goods("フィリピン産 バナナ",400);
    s.show();
    b.show();
  }
}
