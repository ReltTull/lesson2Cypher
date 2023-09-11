package cryptLogic;

public class Decrypter {
    String input;

    public Decrypter(String input) {
        this.input = input;
    }

    public String decrypt() {
        // Создаем таблицы с раскладками для символов на клавиатуре, чтобы использовать индекс для привзяки символов
        String russianLayout = "йцукенгшщзхъфывапролджэячсмитьбю";
        String englishLayout = "qwertyuiop[]asdfghjkl;'zxcvbnm,.";

        // зашифраованное сообщение в виде StringBuilder, который позволит при обходе посимвольно дописывать result
        StringBuilder result = new StringBuilder();
        // проходим по каждому символу input
        for (char c : input.toCharArray()) {
            // если символ в верхнем регистре, то отмечаем это в isUpperCase и меняем на нижний регистр
            boolean isUpperCase = false;
            if (Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
                isUpperCase = true;
            }
            int index = englishLayout.indexOf(c);

            if (index != -1) {
                // если символ найден в русской раскладке, добавляем соответствующий символ из английской раскладки
                char englishChar = russianLayout.charAt(index);
                // возвращаем в изначальный регистр
                if (isUpperCase) {
                    result.append(Character.toUpperCase(englishChar));
                }
                result.append(englishChar);
            } else {
                // прочии символы без изменений
                result.append(c);
            }
        }

        return result.toString();

    }
}
