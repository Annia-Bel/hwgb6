public class main_stend {
    final static String CITY = "Санкт-Петербург";
    final static String API_KEY = "1c87217667796841773e3feec12cbc74";

    private static String getUrlContent(String urlAdress) {
        StringBuffer content = new StringBuffer();
        try {
            URL url = new URL(urlAdress);
            URLConnection urlConn = url.openConnection();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));

            String line;
            while((line = bufferedReader.readLine()) != null) {
                content.append(line + "\n");
            }
            bufferedReader.close();
        } catch(Exception e) {
            System.out.println;
        }
        return content.toString();
    }


    public static void main(String[] args) throws Exception{
        /*  "http://api.accuweather.com/data/2.5/forecast?q="+CITY+"&appid="+API_KEY+"&units=metric"
         * приходит ответ сразу в формате json
         */
        String addres = "http://api.openweathermap.org/data/2.5/forecast?q="+CITY+"&appid="+API_KEY+"&units=metric";
        String answer = getUrlContent(addres);
        System.out.println(answer); // погода на 5 дней в формате JSON …
    }

}