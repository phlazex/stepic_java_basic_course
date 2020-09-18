Вам дан список ролей и сценарий пьесы в виде массива строчек.

Каждая строчка сценария пьесы дана в следующем виде:<br>
Роль: текст

Текст может содержать любые символы.

Напишите метод, который будет группировать строчки по ролям, пронумеровывать их и возвращать результат в виде готового текста (см. пример). Каждая группа распечатывается в следующем виде:

Роль:<br>
i) текст<br>
j) текст2<br>
...<br>
==перевод строки==

i и j -- номера строк в сценарии. Индексация строчек начинается с единицы, выводить группы следует в соответствии с порядком ролей. Переводы строк между группами обязательны, переводы строк в конце текста не учитываются.

Заметим, что вам предстоит обработка огромной пьесы в 50 000 строк для 10 ролей – соответственно, неправильная сборка результирующей строчки может выйти за ограничение по времени.

Обратите внимание еще на несколько нюансов:

* имя персонажа может встречаться в строке более одного раза, в том числе с двоеточием;
* название одной роли может быть префиксом названия другой роли (например, "Лука" и "Лука Лукич");
* роль, у которой нет реплик, тоже должна присутствовать в выходном файле;
* в качестве перевода строки надо использовать символ '\n' (перевод строки в стиле UNIX);
* будьте внимательны, не добавляйте лишних пробелов в конце строк.
***
#### Sample Input:

> roles:<br>
> Городничий<br>
> Аммос Федорович<br>
> Артемий Филиппович<br>
> Лука Лукич<br>
> textLines:<br>
> Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.<br>
> Аммос Федорович: Как ревизор?<br>
> Артемий Филиппович: Как ревизор?<br>
> Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.<br>
> Аммос Федорович: Вот те на!<br>
> Артемий Филиппович: Вот не было заботы, так подай!<br>
> Лука Лукич: Господи боже! еще и с секретным предписаньем!<br>
***
#### Sample Output:

> Городничий:<br>
> <i></i>1) Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.<br>
> 4) Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.<br>
> 
> Аммос Федорович:<br>
> 2) Как ревизор?<br>
> 5) Вот те на!<br>
> 
> Артемий Филиппович:<br>
> 3) Как ревизор?<br>
> 6) Вот не было заботы, так подай!<br>
> 
> Лука Лукич:<br>
> 7) Господи боже! еще и с секретным предписаньем!<br>