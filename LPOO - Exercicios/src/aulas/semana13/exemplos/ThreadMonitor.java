package aulas.semana13.exemplos;

import javax.swing.*;
import javax.swing.tree.*;
public class ThreadMonitor extends JScrollPane {
   private static ThreadMonitor instance = null;
   private JTree tree;
   private DefaultTreeModel dtm;
   // construtor privado
   private ThreadMonitor () {
      // cria �rvore e obt�m seu modelo de dados
      tree = new JTree();
      dtm = (DefaultTreeModel) tree.getModel();
      refresh(); // atualiza dados
      getViewport().setView(tree); // adiciona �rvore ao JScrollPane
   }
   // m�todo garante uma �nica inst�ncia do monitor
   public static final ThreadMonitor getInstance() {
      if (instance==null) {
         instance = new ThreadMonitor();
      }
      return instance;
   }
   public void refresh() {
       // determina grupo raiz das threads
      Thread threadMain = Thread.currentThread();
      ThreadGroup grupoRaiz = threadMain.getThreadGroup().getParent();
      // obt�m lista de grupos e suas threads recursivamente
      dtm.setRoot(listaGrupo(grupoRaiz));
   }
   public DefaultMutableTreeNode listaGrupo(ThreadGroup grupo) {
      DefaultMutableTreeNode node = new DefaultMutableTreeNode(grupo.toString());
      // obt�m informa��o dos subgrupos deste grupo
      int num = grupo.activeGroupCount();
      ThreadGroup subgrupos[] = new ThreadGroup[num];
      grupo.enumerate(subgrupos);
      node.add(new DefaultMutableTreeNode("subgrupos: " + num));
      for(int s=0; s<subgrupos.length; s++) {
         node.add(listaGrupo(subgrupos[s]));
      }
      // lista informa��o das threads deste grupo
      num = grupo.activeCount();
      Thread threads[] = new Thread[num];
      grupo.enumerate(threads);
      DefaultMutableTreeNode aux = new DefaultMutableTreeNode();
      node.add(aux);
      int t = 0;
      for (int i=0; i<num; i++) {
         if (threads[i].getThreadGroup()==grupo) {
            // s� mostra threads do grupo, n�o dos subgrupos
            node.add(new DefaultMutableTreeNode(t + ":" + threads[i].toString()));
            t++;
      } }
      aux.setUserObject("threads: " + t);
      return node;
   }
   public JTree getJTree() {
      return tree;
} }
