package Book;

public class Author {
    private String name;
        private String biography;

        public Author(String name, String biography) {
            this.name = name;
            this.biography = biography;
        }

        public String getName() {
            return name;
        }

        public String getBiography(){
            return biography;
        }
}
