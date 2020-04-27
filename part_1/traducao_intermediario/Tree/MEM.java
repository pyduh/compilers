package traducao_intermediario.Tree;

public class MEM extends Expr {
  public Expr exp;

  public MEM(Expr e) {exp=e;}
  
  public ExpList kids() {return new ExpList(exp,null);}
  
  public Expr build(ExpList kids) {
    return new MEM(kids.head);
  }
}
