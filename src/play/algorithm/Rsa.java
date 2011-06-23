package play.algorithm;
public class Rsa {

  static void f1(int k, int p, int e) {
    String s = Integer.toBinaryString(e);
    String rs = new StringBuffer(s).reverse().toString();
    //System.out.println(rs);

    int last = 1;
    int res = -1;
    for ( int i = 0 ; i < rs.length() ; i++ ) {
      int tmp = Integer.parseInt(rs.substring(i, i + 1));
      if ( i == 0 ) {
        last = k % p;
      } else {
        last = last * last % p;
      }
      if(tmp == 1){
        if ( res == -1 ) {
          if ( i == 0 ) {
            res = k % p;
          } else {
            res = last % p;
          }
        } else {
          res = last * res % p;
        }
      }
    }

    System.out.println("result:" + res);
  }

  public static void main(String[] args) {
    f1(981, 2537, 937);// private key
    f1(704, 2537, 13); // public key
    
    f1(235, 2537, 13);
    f1(707, 2537, 937);
    
    f1(459, 2537, 13);
    f1(1738, 2537, 937); 
  }
}
