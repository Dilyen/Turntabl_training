package io.turntabl.library;
import io.turntabl.library.vars.*;
import io.turntabl.library.books.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
		Book book1 = new Book("Like Stars on the Earth", 23451, Category.DRAMA , "Ahmir Khan", BookState.AVAILABLE);
		Book book2 = new Book("The diary of a Young Girl", 23451, Category.HISTORIC, "Anne Frank", BookState.UNAVAILABLE);
		Book book3 = new Book("Like Stars on the Earth", 23451, Category.DRAMA , "Ahmir Khan", BookState.AVAILABLE);
		Book book4 = new Book("The diary of a Young Girl", 23451, Category.HISTORIC, "Anne Frank", BookState.UNAVAILABLE);
		Book book5 = new Book("Like Stars on the Earth", 23451, Category.DRAMA , "Ahmir Khan", BookState.AVAILABLE);
		Book book6 = new Book("The diary of a Young Girl", 23451, Category.HISTORIC, "Anne Frank", BookState.UNAVAILABLE);
		Book book7 = new Book("Like Stars on the Earth", 23451, Category.DRAMA , "Ahmir Khan", BookState.AVAILABLE);
		Book book8 = new Book("The diary of a Young Girl", 23451, Category.HISTORIC, "Anne Frank", BookState.UNAVAILABLE);
		Book book9 = new Book("Like Stars on the Earth", 23451, Category.DRAMA , "Ahmir Khan", BookState.AVAILABLE);
		Book book10 = new Book("The diary of a Young Girl", 23451, Category.HISTORIC, "Anne Frank", BookState.UNAVAILABLE);
		Book book11 = new Book("Like Stars on the Earth", 23451, Category.DRAMA , "Ahmir Khan", BookState.AVAILABLE);
		Book book12 = new Book("The diary of a Young Girl", 23451, Category.HISTORIC, "Anne Frank", BookState.UNAVAILABLE);
		Book book13 = new Book("Like Stars on the Earth", 23451, Category.DRAMA , "Ahmir Khan", BookState.AVAILABLE);
		Book book14 = new Book("The diary of a Young Girl", 23451, Category.HISTORIC, "Anne Frank", BookState.UNAVAILABLE);



		List<Book> books = Arrays.asList(book1, book2, book3, book4, book5, book6, book7, book8, book9, book10, book11, book12, book13, book14);

		for(Book book : books){
			if(book.getCategory() == Category.DRAMA){
				System.out.println("Titile: " + book.getTitle() + " Category: " + book.getCategory());
			}
		}
		System.out.println("==================================================");
		System.out.println("==================================================");




		List <Borrower> borrowerList = Arrays.asList(
				new Borrower("Shadrack", 10, "24-10-2019", "29-10-2019", "5:30pm", BorrowerType.PREMIUM, books),
				new Borrower("Justina", 22, "24-10-2019", "29-10-2019", "5:30pm", BorrowerType.GOLD, books),
				new Borrower("Maxwell", 26, "24-10-2019", "29-10-2019", "5:30pm", BorrowerType.GOLD, books),
				new Borrower("Cleopatra", 53, "24-10-2019", "29-10-2019", "5:30pm", BorrowerType.REGULAR, books),
				new Borrower("Nana Ama", 14, "24-10-2019", "29-10-2019", "5:30pm", BorrowerType.CHILDREN, books),
				new Borrower("Eva", 15, "24-10-2019", "29-10-2019", "5:30pm", BorrowerType.PREMIUM, books),
				new Borrower("Enock", 81, "24-10-2019", "29-10-2019", "5:30pm", BorrowerType.GOLD, books),
				new Borrower("Esther", 36, "24-10-2019", "29-10-2019", "5:30pm", BorrowerType.GOLD, books),
				new Borrower("Rexford", 18, "24-10-2019", "29-10-2019", "5:30pm", BorrowerType.PREMIUM, books),
				new Borrower("Nelson", 48, "24-10-2019", "29-10-2019", "5:30pm", BorrowerType.REGULAR, books),
				new Borrower("Alice", 20, "24-10-2019", "29-10-2019", "5:30pm", BorrowerType.CHILDREN, books)
		);

		printBorrowers(borrowerList);

		//Getting all Gold Borrowers
		List <Borrower> goldBorrowers = new ArrayList<>();

		for (Borrower gb : borrowerList){
			if(gb.getType() == BorrowerType.GOLD) {
				goldBorrowers.add(gb);
			}
		}

		List <String> borrowersNames = new ArrayList<>();

		for (Borrower borrowerName : goldBorrowers){
			borrowersNames.add(borrowerName.getName());
		}

		System.out.println(borrowersNames);

		System.out.println("List of Gold Borrowers: ");
		for(String name : borrowersNames){
			System.out.println(name);
		}

//		int maxId = 0;
//		String maxIdName = "";
//		for (Borrower gb : goldBorrowers){
//			if(gb.getId() > maxId){
//				maxId = gb.getId();
//				maxIdName = gb.getName();
//			}
//		}
//
//		System.out.print("Gold Borrower with Highest Id| Name: " + maxIdName + " id: " + maxId);

		Borrower maxBId = borrowerList.stream()
				.filter(b -> b.getType() == BorrowerType.GOLD)
				.max( Comparator.comparing( Borrower::getId )).get();

		System.out.println("Gold Borrower with Highest Id: " + maxBId.getName());
    }

    public static void printBorrowers(List<Borrower> borrowers){
		System.out.println(borrowers);
		System.out.println("Length: " + borrowers.size());
	}
}
