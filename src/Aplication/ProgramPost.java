package Aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import entities.Comment;
import entities.Post;

public class ProgramPost {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment comentario_1 = new Comment("Have a nice trip !");
		Comment comentario_2 = new Comment("Wow that´s awesome !");
		
		Post post_1 = new Post(
				sdf.parse("21/06/2018 13:05:44"), 
				"Traveling to New Zealand ", 
				"I'm going to visit this wonderful country! ",
				12);
		
		post_1.addComment(comentario_1);
		post_1.addComment(comentario_2);
		
		Comment comentario_3 = new Comment("Good Night");
		Comment comentario_4 = new Comment("May the Force be with you");
		
		Post post_2 = new Post (
				sdf.parse("28/07/2018 23:14:19"),
				"Good Night guys",
				"See you Tomorrow",
				5);
		
		post_2.addComment(comentario_3);
		post_2.addComment(comentario_4);		
				
		System.out.println(post_1);
		System.out.println(post_2);
		

	}

}
