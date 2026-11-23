<h2><a href="https://codeforces.com/contest/1760/problem/A" target="_blank" rel="noopener noreferrer">1760A — Medium Number</a></h2>

| | |
|---|---|
| **Difficulty** | 800 |
| **Language** | Java 21 |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 1760A](https://codeforces.com/contest/1760/problem/A) |

## Topics
`implementation` `sortings`

---

## Problem Statement

<div class="header"><div class="title">A. По середине</div><div class="time-limit"><div class="property-title">ограничение по времени на тест</div>1 секунда</div><div class="memory-limit"><div class="property-title">ограничение по памяти на тест</div>256 мегабайт</div><div class="input-file input-standard"><div class="property-title">ввод</div>стандартный ввод</div><div class="output-file output-standard"><div class="property-title">вывод</div>стандартный вывод</div></div><div><p>Даны три <span class="tex-font-style-bf">различных</span> целых числа $$$a$$$, $$$b$$$, и $$$c$$$. Найдите среднее из них. Другими словами, найдите среди заданных трёх чисел число не являющееся ни минимумом, ни максимумом.</p><p>Например, средним число среди $$$5,2,6$$$ будет $$$5$$$, так как минимумом является $$$2$$$, а максимумом $$$6$$$.</p></div><div class="input-specification"><div class="section-title">Входные данные</div><p>Первая строка содержит одно число $$$t$$$ ($$$1 \leq t \leq 6840$$$) — количество наборов входных данных.</p><p>Первая строка каждого набора содержит три <span class="tex-font-style-bf">различных</span> целых числа $$$a$$$, $$$b$$$, $$$c$$$ ($$$1 \leq a, b, c \leq 20$$$). </p></div><div class="output-specification"><div class="section-title">Выходные данные</div><p>Для каждого набора выведите одно целое число — среднее среди трёх данных чисел.</p></div><div class="sample-tests"><div class="section-title">Пример</div><div class="sample-test"><div class="input"><div class="title">Входные данные<div title="Скопировать" data-clipboard-target="#id004801611499594427" id="id0030155124128900024" class="input-output-copier">Скопировать</div></div><pre data-content="9
5 2 6
14 3 4
20 2 1
1 2 3
11 19 12
10 8 20
6 20 3
4 1 3
19 8 4
" id="id004801611499594427"><div class="test-example-line test-example-line-even test-example-line-0">9</div><div class="test-example-line test-example-line-odd test-example-line-1">5 2 6</div><div class="test-example-line test-example-line-even test-example-line-2">14 3 4</div><div class="test-example-line test-example-line-odd test-example-line-3">20 2 1</div><div class="test-example-line test-example-line-even test-example-line-4">1 2 3</div><div class="test-example-line test-example-line-odd test-example-line-5">11 19 12</div><div class="test-example-line test-example-line-even test-example-line-6">10 8 20</div><div class="test-example-line test-example-line-odd test-example-line-7">6 20 3</div><div class="test-example-line test-example-line-even test-example-line-8">4 1 3</div><div class="test-example-line test-example-line-odd test-example-line-9">19 8 4</div></pre></div><div class="output"><div class="title">Выходные данные<div title="Скопировать" data-clipboard-target="#id0004769256046691217" id="id008738787745509593" class="input-output-copier">Скопировать</div></div><pre id="id0004769256046691217">5
4
2
2
12
10
6
3
8
</pre></div></div></div>