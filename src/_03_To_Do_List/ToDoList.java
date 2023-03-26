package _03_To_Do_List;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ToDoList implements ActionListener {
	/*
	 * Create a program with five buttons, add task, view tasks, remove task, save list, and load list. 
	 *
	 * When add task is clicked:
	 * 		Create a JOptionPane to ask the user for a task and add it to an ArrayList
	 * 
	 * When the view tasks button is clicked:
	 *		show all the tasks in the list
	 * 
	 * When the remove task button is clicked:
	 * 		Create a JOptionPane to prompt the user for which task to remove and take it off of the list.
	 * 
	 * When the save list button is clicked:
	 * 		Save the list to a file
	 * 
	 * When the load list button is clicked:
	 * 		Create a JOptionPane to Prompt the user for the location of the file and load the list from that file
	 * 
	 * When the program starts, it should automatically load the last saved file into the list. 
	 */
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton addTask = new JButton("add task");
	JButton viewTask = new JButton("view task");
	JButton removeTask = new JButton("remove task");
	JButton saveList = new JButton("save list");
	JButton loadList = new JButton("load list");
	ArrayList<String> tasks = new ArrayList<String>();
	public void buttons() {
		frame.add(panel);
		frame.setVisible(true);
		panel.add(addTask);
		panel.add(viewTask);
		panel.add(removeTask);
		panel.add(saveList);
		panel.add(loadList);
		addTask.addActionListener(this);
		viewTask.addActionListener(this);
		removeTask.addActionListener(this);
		saveList.addActionListener(this);
		loadList.addActionListener(this);
		frame.pack();
	}
	public static void main(String[] args) {
		ToDoList framer = new ToDoList();
		framer.buttons();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==addTask) {
			String task = JOptionPane.showInputDialog("Enter the task");
			tasks.add(task);
		} else if (e.getSource()==viewTask) {
			for (int i = 0; i < tasks.size(); i++) {
				System.out.println(tasks.get(i) + "\n");
			}
		} else if (e.getSource()==removeTask) {
			String remove = JOptionPane.showInputDialog("Enter the task number to get rid of");
			int remover = Integer.parseInt(remove);
			tasks.remove(remover);
		} else if (e.getSource()==saveList) {
			for (int i = 0; i < tasks.size(); i++) {
				try {
					FileWriter fw = new FileWriter("src/_03_To_Do_List/test.txt", true);
					
					fw.write(tasks.get(i) + "\n");
						
					fw.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		} else if (e.getSource()==loadList) {
			String location = JOptionPane.showInputDialog("Enter the location of the file");
			tasks = new ArrayList<String>();
			try {
				BufferedReader br = new BufferedReader(new FileReader("src/_03_To_Do_List/test.txt"));
				
				String line = br.readLine();
				while(line != null){
					tasks.add(line);
					line = br.readLine();
				}
				
				br.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
		}
	}
}
//Copyright © 2023 Hailin Day//Copyright © 2023 Hailin Day