package analisador_semantico.syntaxtree;

import analisador_semantico.syntaxtree.*;
import analisador_semantico.visitors.*;
import traducao_intermediario.visitor.*;
import traducao_intermediario.Translate.*;

public class ArrayAssignStatement extends Statement {
	public Identifier id;
	public Expression e1, e2;

	public ArrayAssignStatement(Expression e1, Expression e2, Identifier id) {
		this.id = id;
		this.e1 = e1;
		this.e2 = e2;
	}

	public void accept(Visitor v) {
		v.visit(this);
	}

	public Type accept(TypeVisitor v) {
		return v.visit(this);
	}

	public Exp accept(VisitorIR v) {
		return v.visit(this);
	}
}