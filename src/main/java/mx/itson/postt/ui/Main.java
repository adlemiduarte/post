/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.postt.ui;



import java.util.Locale;
import mx.itson.postt.entidades.Category;
import mx.itson.postt.entidades.Comments;
import mx.itson.postt.entidades.Publication;
import mx.itson.postt.entidades.Reaction;
import mx.itson.postt.entidades.ReponseComment;
import mx.itson.postt.entidades.User;



/**
 *
 * @author Adlemi Duarte
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Lee la informacion del usuario que hara la publicacion.
       User user = new User();       
       user.setName("Adlemi Duarte");
       user.setEmail("adlemi244242@email.com");
       user.setPassword("adlemi1234");
       
        //Lee la informacion de la publicación realizada.
       Category category = new Category();
       category.setName("SKINCARE");
       category.setCategoryDescription("Trata sobre el cuidado de la piel. Se relaciona con diferentes rutinas para lucir feescos y sanos");
   
       //Lee comentarios.
       Publication publication = new Publication();      
       publication.setUser(user);
       publication.setCategory(Locale.Category.DISPLAY);
       publication.setPostName("Como cuidar la piel");
       publication.setDescription("Te recomiendo usar productos adecuados a tu tipo de piel");    
       publication.setDate(17/03/2023);
       
       //Lee las reacciones.
       Reaction reaction = new Reaction();
       reaction.setDislike(7);
       reaction.setLike(58);
       
       Comments comments = new Comments();
       comments.setUser(user);
       comments.setDescription("Me encanta este tema");
       comments.setDate(17/10/2023);
       comments.setLike(24);
       comments.setDislike(9);
       
       ReponseComment reponseComment = new ReponseComment();
       reponseComment.setUser(user);
       reponseComment.setDescription("Podrias ayudarme");
       reponseComment.setDate(18/10/2023);
       reponseComment.setDislike(0);
       reponseComment.setLike(2);
       
       
        //Despliega la información en la consola.
       System.out.println("User: "+user.getName());
       System.out.println("Email: "+user.getEmail());
       System.out.println("                         ");
       System.out.println("-------------------------");
       System.out.println("New: "+publication.getPostName());
       System.out.println("Date: "+publication.getDate());
       System.out.println("                         ");
       System.out.println("-------------------------");
       System.out.println("Description: "+publication.getDescription());
       System.out.println("In Category: "+publication.getCategory());
       System.out.println("                         ");
       System.out.println("-------------------------");
       System.out.println("COMMENTS AND OPINIONS");
       System.out.println("Comments: "+comments.getUser());
       System.out.println("Description: "+comments.getDescription());
       System.out.println("Like: "+reaction.getLike());
       System.out.println("Dislike: "+reaction.getDislike());
       
       
       
       
        
    }
    
}
