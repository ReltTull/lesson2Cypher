Facade паттерн на примере шифровальщика символов русской раскладки клавиатуры на английскую и наоборот.
Уровень клиента в классе Main. В Facade два конструктора: один на случай ввода сообщения на кириллице, один - на латинице. Ну и по методу перевода в обе стороны, в которых идёт обращение к классам Crypter и Decrypter.
