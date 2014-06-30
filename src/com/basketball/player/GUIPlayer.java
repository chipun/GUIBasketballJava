package com.basketball.player;

import java.awt.event.*;

import javax.swing.*;

import java.awt.GridLayout;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

@SuppressWarnings("serial")
public class GUIPlayer extends JFrame implements ActionListener {
	
	JLabel lblPoints = new JLabel("Total Points");
	JTextField txtPoints = new JTextField(8);
	
	JLabel lblRebounds = new JLabel("Total Rebounds");
	JTextField txtRebounds = new JTextField(8);
	
	JLabel lblSteals = new JLabel("Total Steals");
	JTextField txtSteals  = new JTextField(8);
	
	JLabel lblGames = new JLabel("Total Games");
	JTextField txtGamess  = new JTextField(8);
	
	JLabel lblavgPoints = new JLabel("Average Points");
	JTextField txtavgPoints  = new JTextField(8);
	JLabel lblavgRebounds = new JLabel("Average Rebounds");
	JTextField txtavgRebounds = new JTextField(8);
	JLabel lblavgSteals = new JLabel("Average Steals");
	JTextField txtavgSteals = new JTextField(8);
	
	JLabel lblError = new JLabel("Error:");
	JTextField txtError = new JTextField(8);
	

	
	JButton btnGo = new JButton("Go");
	JButton btnReset = new JButton("Reset");
	
	GUIPlayer()
	{
		JLabel lblTitle = new JLabel("Player Career");
		GridLayout gr = new GridLayout(9,2,1,1);
	    setLayout(gr); 
	    
	    add(lblPoints);
	    add(txtPoints);
	    add(lblRebounds);
	    add(txtRebounds);
	    add(lblSteals);
	    add(txtSteals);
	    add(lblGames);
	    add(txtGamess);
	    add(lblavgPoints);
	    add(txtavgPoints);
	    add(lblavgRebounds);
	    add(txtavgRebounds);
	    add(lblavgSteals);
	    add(txtavgSteals);
	    add(lblError);
	    add(txtError);
	    add(btnGo);
	    add(btnReset);
	    
	    txtavgPoints.setEditable(false);
	    txtavgRebounds.setEditable(false);
	    txtavgSteals.setEditable(false);
	    lblError.setVisible(false);
	    txtError.setVisible(false);
	   
	    this.btnGo.addActionListener(this);   
	    this.btnReset.addActionListener(this); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GUIPlayer g = new GUIPlayer();
		g.setTitle(g.getTitle());
		g.setSize(500,200);
		g.setVisible(true);
		
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		Object source = arg0.getSource();
		
		if(arg0.getActionCommand() == "Go")
		{
			try
			{
				int inputPoints= Integer.parseInt(txtPoints.getText());
				int inputRebounds= Integer.parseInt(txtRebounds.getText());
				int inputSteals= Integer.parseInt(txtSteals.getText());
				int inputGames= Integer.parseInt(txtGamess.getText());
				
				CareerStats playerCareer = new CareerStats(inputPoints, inputRebounds, inputSteals, inputGames);
				
				txtavgPoints.setText(Double.toString(playerCareer.AvgPoints())); 
				txtavgRebounds.setText(Double.toString(playerCareer.AvgRebounds())); 
				txtavgSteals.setText(Double.toString(playerCareer.AvgSteals())); 
				
			}
			catch(NumberFormatException ex )
			{
			    lblError.setVisible(true);
			    txtError.setVisible(true);
			    txtError.setText(ex.getMessage());
			}
		}
		else if(arg0.getActionCommand() == "Reset")
		{
			txtPoints.setText("");
			txtRebounds.setText("");
			txtSteals.setText("");
			txtGamess.setText("");
			txtavgPoints.setText("");
			txtavgRebounds.setText("");
			txtavgSteals.setText("");
			
			lblError.setVisible(false);
			txtError.setVisible(false);
			   
		}
		
	}

}
