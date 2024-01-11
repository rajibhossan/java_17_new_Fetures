public class TextBlock {

    private static String JsonNormalString = "{\n" +
            "  \"username\": \"applicant@gmail.com\",\n" +
            "  \"password\": \"pass1\"\n" +
            "}";


    private static String JsonTextBox = """ 
            {
            "username": "applicant@gmail.com",
            "password": "pass1"
            }
            """;


    private static String htmlTextBox = """
            <!DOCTYPE html>
            <html>
            <body>
                        
            <h1>My First Heading</h1>
                        
            <p>My first paragraph.</p>
                        
            </body>
            </html>            
            """;


    private static String xmlTextBox = """
            <?xml version="1.0" encoding="UTF-8"?>
            <note>
              <to>Tove</to>
              <from>Jani</from>
              <heading>Reminder</heading>
              <body>Don't forget me this weekend!</body>
            </note>    
            """;


    private static String sqlTextBox = """
            SELECT * FROM Customers
            WHERE Country='Mexico';
            """;


    public static String getCoursJson(String userName, String password) {

        return """
                {
                "username": "%s",
                "password": "%s"
                }
                  """.formatted(userName, password);
    }

    public static void main(String[] args) {

        System.out.println(JsonNormalString);
        System.out.println(JsonTextBox);
        System.out.println(htmlTextBox);
        System.out.println(xmlTextBox);
        System.out.println(sqlTextBox);
        System.out.println(getCoursJson("rajib@gmail.com", "pass1"));
    }


}
