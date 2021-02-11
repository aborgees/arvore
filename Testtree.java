public class Testtree {
	public static void main(String[] args) {

		Tree<Integer> tree = new Tree<Integer>();
		tree.adicionar(8);
		tree.adicionar(10);
		tree.adicionar(7);
		tree.adicionar(9);
		tree.adicionar(5);
		tree.adicionar(8);
		tree.adicionar(2);
		tree.adicionar(4);
		System.out.println("Em ordem: ");
		tree.emOrdem(tree.getRaiz());

		System.out.println("\nPré Ordem: ");
		tree.preOrdem(tree.getRaiz());

		System.out.println("\nPós Ordem: ");
		tree.posOrdem(tree.getRaiz());
	}
}
