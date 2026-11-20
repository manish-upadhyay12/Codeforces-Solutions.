<h2><a href="https://codeforces.com/contest/1399/problem/A" target="_blank" rel="noopener noreferrer">1399A — Remove Smallest</a></h2>

| | |
|---|---|
| **Difficulty** | 800 |
| **Language** | Java 21 |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 1399A](https://codeforces.com/contest/1399/problem/A) |

## Topics
`greedy` `sortings`

---

## Problem Statement

<div class="header"><div class="title">A. Удалить наименьшее</div><div class="time-limit"><div class="property-title">ограничение по времени на тест</div>1 секунда</div><div class="memory-limit"><div class="property-title">ограничение по памяти на тест</div>256 мегабайт</div><div class="input-file input-standard"><div class="property-title">ввод</div>стандартный ввод</div><div class="output-file output-standard"><div class="property-title">вывод</div>стандартный вывод</div></div><div><p>Вам дан массив $$$a$$$, состоящий из $$$n$$$ положительных (больших нуля) целых чисел.</p><p>За один ход вы можете выбрать два индекса $$$i$$$ и $$$j$$$ ($$$i \ne j$$$) таких, что абсолютная разность между $$$a_i$$$ и $$$a_j$$$ не превосходит единицу ($$$|a_i - a_j| \le 1$$$), и удалить наименьший из этих двух элементов. Если два элемента равны, вы можете удалить любой из них (но только один).</p><p>Ваша задача — определить, возможно ли получить массив, состоящий <span class="tex-font-style-bf">только из одного элемента</span>, применив несколько (возможно, ноль) таких ходов, или нет.</p><p>Вам нужно ответить на $$$t$$$ независимых наборов тестовых данных.</p></div><div class="input-specification"><div class="section-title">Входные данные</div><p>Первая строка теста содержит одно целое число $$$t$$$ ($$$1 \le t \le 1000$$$) — количество наборов тестовых данных. Затем следуют $$$t$$$ наборов тестовых данных.</p><p>Первая строка набора тестовых данных содержит одно целое число $$$n$$$ ($$$1 \le n \le 50$$$) — длину $$$a$$$. Вторая строка набора тестовых данных содержит $$$n$$$ целых чисел $$$a_1, a_2, \dots, a_n$$$ ($$$1 \le a_i \le 100$$$), где $$$a_i$$$ — $$$i$$$-й элемент $$$a$$$.</p></div><div class="output-specification"><div class="section-title">Выходные данные</div><p>Для каждого набора тестовых данных выведите ответ на него: «<span class="tex-font-style-tt">YES</span>», если возможно получить массив, состоящий <span class="tex-font-style-bf">только из одного элемента</span>, применив несколько (возможно, ноль) ходов, описанных в условии задачи, или «<span class="tex-font-style-tt">NO</span>» в обратном случае.</p></div><div class="sample-tests"><div class="section-title">Пример</div><div class="sample-test"><div class="input"><div class="title">Входные данные<div title="Скопировать" data-clipboard-target="#id0010499417828934043" id="id0031655495388607047" class="input-output-copier">Скопировать</div></div><pre id="id0010499417828934043">5
3
1 2 2
4
5 5 5 5
3
1 2 4
4
1 3 4 4
1
100
</pre></div><div class="output"><div class="title">Выходные данные<div title="Скопировать" data-clipboard-target="#id001841276387118992" id="id003175016022852529" class="input-output-copier">Скопировать</div></div><pre id="id001841276387118992">YES
YES
NO
NO
YES
</pre></div></div></div><div class="note"><div class="section-title">Примечание</div><p>В первом наборе тестовых данных примера мы можем применить следующую последовательность ходов:</p><ul> <li> выбрать $$$i=1$$$ и $$$j=3$$$, а затем удалить $$$a_i$$$ (таким образом, $$$a$$$ превратится в $$$[2; 2]$$$); </li><li> выбрать $$$i=1$$$ и $$$j=2$$$, а затем удалить $$$a_j$$$ (таким образом, $$$a$$$ превратится в $$$[2]$$$). </li></ul><p>Во втором наборе тестовых данных примера мы можем выбирать любые возможные $$$i$$$ и $$$j$$$ в течение любого хода и удалять любой элемент из пары.</p><p>В третьем наборе тестовых данных примера не существует способа избавиться от $$$2$$$ и $$$4$$$.</p></div>