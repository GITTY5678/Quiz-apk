import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        Questionbank questionbank = new Questionbank();
        Admin admin = new Admin("Hariharasuthan");
        admin.ShowInfo();
        System.out.println("Enter user name:");
        String user_name= scan.nextLine();
        PLAYER player = new PLAYER(user_name);
        player.ShowInfo();

        admin.addQuestion(questionbank, new Question("What is Java?",new String[]{ "Programming Language", "A type of coffee", "A type of car", "A type of fruit", "A type of animal"}, 1));
        admin.addQuestion(questionbank, new Question("What is the capital of France?", new String[]{ "Berlin", "Madrid", "Paris", "Rome", "London"}, 3));
        admin.addQuestion(questionbank, new Question("What is the largest planet in our solar system?", new String[]{ "Earth", "Mars", "Jupiter", "Saturn", "Venus"}, 3));
        admin.addQuestion(questionbank, new Question("Who wrote 'Romeo and Juliet'?", new String[]{ "Charles Dickens", "William Shakespeare", "Jane Austen", "Mark Twain", "Leo Tolstoy"}, 2));
        admin.addQuestion(questionbank, new Question("What is the boiling point of water?", new String[]{ "90°C", "100°C", "80°C", "120°C", "70°C"}, 2));
        admin.addQuestion(questionbank, new Question("Which planet is known as the Red Planet?", new String[]{ "Venus", "Mars", "Jupiter", "Saturn", "Mercury"}, 2));
        admin.addQuestion(questionbank, new Question("What is the chemical symbol for gold?", new String[]{ "Au", "Ag", "Gd", "Go", "Ga"}, 1));
        admin.addQuestion(questionbank, new Question("Who painted the Mona Lisa?", new String[]{ "Vincent van Gogh", "Pablo Picasso", "Leonardo da Vinci", "Claude Monet", "Michelangelo"}, 3));
        admin.addQuestion(questionbank, new Question("What is the largest ocean on Earth?", new String[]{ "Atlantic Ocean", "Indian Ocean", "Arctic Ocean", "Pacific Ocean", "Southern Ocean"}, 4));
        admin.addQuestion(questionbank, new Question("Which country is known as the Land of the Rising Sun?", new String[]{ "China", "Japan", "Thailand", "South Korea", "Vietnam"}, 2));
        admin.addQuestion(questionbank, new Question("What is the hardest natural substance?", new String[]{ "Gold", "Iron", "Diamond", "Silver", "Platinum"}, 3));
        admin.addQuestion(questionbank, new Question("Who discovered gravity?", new String[]{ "Albert Einstein", "Isaac Newton", "Galileo Galilei", "Nikola Tesla", "Stephen Hawking"}, 2));
        admin.addQuestion(questionbank, new Question("What is the capital of Australia?", new String[]{ "Sydney", "Melbourne", "Canberra", "Brisbane", "Perth"}, 3));
        admin.addQuestion(questionbank, new Question("Which element has the chemical symbol 'O'?", new String[]{ "Osmium", "Oxygen", "Gold", "Silver", "Iron"}, 2));
        admin.addQuestion(questionbank, new Question("Who is known as the father of computers?", new String[]{ "Charles Babbage", "Alan Turing", "Bill Gates", "Steve Jobs", "Tim Berners-Lee"}, 1));
        admin.addQuestion(questionbank, new Question("What is the tallest mountain in the world?", new String[]{ "K2", "Mount Everest", "Kangchenjunga", "Lhotse", "Makalu"}, 2));
        admin.addQuestion(questionbank, new Question("Which gas do plants absorb from the atmosphere?", new String[]{ "Oxygen", "Nitrogen", "Carbon Dioxide", "Hydrogen", "Methane"}, 3));
        admin.addQuestion(questionbank, new Question("Who invented the telephone?", new String[]{ "Thomas Edison", "Alexander Graham Bell", "Nikola Tesla", "Guglielmo Marconi", "James Watt"}, 2));
        admin.addQuestion(questionbank, new Question("What is the largest mammal?", new String[]{ "Elephant", "Blue Whale", "Giraffe", "Hippopotamus", "Rhino"}, 2));
        admin.addQuestion(questionbank, new Question("Which continent is the Sahara Desert located in?", new String[]{ "Asia", "Africa", "Australia", "Europe", "South America"}, 2));
        admin.addQuestion(questionbank, new Question("What is the smallest prime number?", new String[]{ "0", "1", "2", "3", "5"}, 3));
        admin.addQuestion(questionbank, new Question("Who wrote 'Harry Potter'?", new String[]{ "J.K. Rowling", "Stephen King", "J.R.R. Tolkien", "George R.R. Martin", "Agatha Christie"}, 1));
        admin.addQuestion(questionbank, new Question("What is the capital of India?", new String[]{ "Mumbai", "Delhi", "Kolkata", "Chennai", "Bangalore"}, 2));
        admin.addQuestion(questionbank, new Question("Which organ purifies blood in the human body?", new String[]{ "Heart", "Liver", "Kidney", "Lungs", "Stomach"}, 3));
        admin.addQuestion(questionbank, new Question("What is the largest land animal?", new String[]{ "Giraffe", "Elephant", "Rhino", "Hippopotamus", "Lion"}, 2));
        admin.addQuestion(questionbank, new Question("Who is the founder of Microsoft?", new String[]{ "Steve Jobs", "Bill Gates", "Larry Page", "Mark Zuckerberg", "Elon Musk"}, 2));
        admin.addQuestion(questionbank, new Question("What is the freezing point of water?", new String[]{ "0°C", "32°C", "100°C", "10°C", "50°C"}, 1));
        admin.addQuestion(questionbank, new Question("Which planet is closest to the Sun?", new String[]{ "Venus", "Earth", "Mercury", "Mars", "Jupiter"}, 3));
        admin.addQuestion(questionbank, new Question("Who wrote 'The Odyssey'?", new String[]{ "Homer", "Virgil", "Sophocles", "Plato", "Aristotle"}, 1));
        admin.addQuestion(questionbank, new Question("What is the capital of Italy?", new String[]{ "Rome", "Venice", "Florence", "Milan", "Naples"}, 1));
        admin.addQuestion(questionbank, new Question("Which animal is known as the King of the Jungle?", new String[]{ "Tiger", "Lion", "Elephant", "Leopard", "Cheetah"}, 2));
        admin.addQuestion(questionbank, new Question("What is the largest continent?", new String[]{ "Africa", "Asia", "Europe", "North America", "Australia"}, 2));
        admin.addQuestion(questionbank, new Question("Who invented the light bulb?", new String[]{ "Nikola Tesla", "Thomas Edison", "Alexander Graham Bell", "James Watt", "Benjamin Franklin"}, 2));
        admin.addQuestion(questionbank, new Question("What is the chemical symbol for water?", new String[]{ "H2O", "O2", "CO2", "HO", "OH"}, 1));
        admin.addQuestion(questionbank, new Question("Which country is famous for the Eiffel Tower?", new String[]{ "Italy", "France", "Germany", "Spain", "England"}, 2));
        admin.addQuestion(questionbank, new Question("What is the capital of the United States?", new String[]{ "New York", "Washington D.C.", "Los Angeles", "Chicago", "San Francisco"}, 2));
        admin.addQuestion(questionbank, new Question("Who is known as the Iron Man?", new String[]{ "Elon Musk", "Robert Downey Jr.", "Tony Stark", "Bill Gates", "Steve Jobs"}, 3));
        admin.addQuestion(questionbank, new Question("What is the largest bird?", new String[]{ "Eagle", "Ostrich", "Penguin", "Peacock", "Swan"}, 2));
        admin.addQuestion(questionbank, new Question("Which planet is known for its rings?", new String[]{ "Jupiter", "Saturn", "Uranus", "Neptune", "Mars"}, 2));
        admin.addQuestion(questionbank, new Question("Who wrote 'Pride and Prejudice'?", new String[]{ "Jane Austen", "Emily Bronte", "Charlotte Bronte", "George Eliot", "Virginia Woolf"}, 1));
        admin.addQuestion(questionbank, new Question("What is the capital of China?", new String[]{ "Shanghai", "Beijing", "Hong Kong", "Guangzhou", "Shenzhen"}, 2));
        admin.addQuestion(questionbank, new Question("Which is the longest river in the world?", new String[]{ "Amazon", "Nile", "Yangtze", "Mississippi", "Danube"}, 2));
        admin.addQuestion(questionbank, new Question("Who invented the airplane?", new String[]{ "Wright Brothers", "Leonardo da Vinci", "Alexander Graham Bell", "Thomas Edison", "Nikola Tesla"}, 1));
        admin.addQuestion(questionbank, new Question("What is the capital of Russia?", new String[]{ "Moscow", "Saint Petersburg", "Kazan", "Novosibirsk", "Sochi"}, 1));
        admin.addQuestion(questionbank, new Question("Which is the smallest continent?", new String[]{ "Europe", "Australia", "Antarctica", "South America", "Africa"}, 2));
        admin.addQuestion(questionbank, new Question("Who discovered penicillin?", new String[]{ "Alexander Fleming", "Louis Pasteur", "Marie Curie", "Isaac Newton", "Albert Einstein"}, 1));
        admin.addQuestion(questionbank, new Question("What is the capital of Germany?", new String[]{ "Berlin", "Munich", "Frankfurt", "Hamburg", "Cologne"}, 1));
        admin.addQuestion(questionbank, new Question("Which is the largest desert in the world?", new String[]{ "Gobi", "Sahara", "Arabian", "Antarctic", "Kalahari"}, 4));
        admin.addQuestion(questionbank, new Question("Who is known as the father of physics?", new String[]{ "Isaac Newton", "Albert Einstein", "Galileo Galilei", "Stephen Hawking", "Nikola Tesla"}, 1));
        admin.addQuestion(questionbank, new Question("What is the capital of Brazil?", new String[]{ "Rio de Janeiro", "Brasilia", "Sao Paulo", "Salvador", "Fortaleza"}, 2));
        admin.addQuestion(questionbank, new Question("Which is the largest island in the world?", new String[]{ "Greenland", "Australia", "Madagascar", "Borneo", "Sumatra"}, 1));
        admin.addQuestion(questionbank, new Question("Who wrote 'The Lord of the Rings'?", new String[]{ "J.R.R. Tolkien", "C.S. Lewis", "J.K. Rowling", "George R.R. Martin", "Stephen King"}, 1));
        admin.addQuestion(questionbank, new Question("What is the capital of Canada?", new String[]{ "Toronto", "Ottawa", "Vancouver", "Montreal", "Calgary"}, 2));
        admin.addQuestion(questionbank, new Question("Which is the largest lake in the world?", new String[]{ "Lake Superior", "Caspian Sea", "Lake Victoria", "Lake Michigan", "Lake Baikal"}, 2));
        admin.addQuestion(questionbank, new Question("Who invented the World Wide Web?", new String[]{ "Tim Berners-Lee", "Bill Gates", "Steve Jobs", "Larry Page", "Mark Zuckerberg"}, 1));
    
        int score = 0;
        for (Question question: questionbank.getQuestions()){
            question.display();
            System.out.println("Enter your answer (1-" + "4" + "): ");
            int answer = scan.nextInt();
            if(question.checkAnswer(answer)){
                score++;
                System.out.println("Correct Answer!");
            } else {
                System.out.println("Wrong Answer! The correct answer was: " + question.options[question.correctAnswer - 1]);    
            }
        }
    }

}
