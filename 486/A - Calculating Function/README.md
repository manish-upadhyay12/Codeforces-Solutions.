<h2><a href="https://codeforces.com/contest/486/problem/A" target="_blank" rel="noopener noreferrer">486A — Calculating Function</a></h2>

| | |
|---|---|
| **Difficulty** | 800 |
| **Language** | Java 21 |
| **Verdict** | ✅ Accepted |
| **Problem Link** | [Codeforces 486A](https://codeforces.com/contest/486/problem/A) |

## Topics
`implementation` `math`

---

## Problem Statement

<div class="header"><div class="title">A. Подсчёт функции</div><div class="time-limit"><div class="property-title">ограничение по времени на тест</div>1 секунда</div><div class="memory-limit"><div class="property-title">ограничение по памяти на тест</div>256 мегабайт</div><div class="input-file input-standard" style="font-weight: bold"><div class="property-title">ввод</div>stdin</div><div class="output-file output-standard" style="font-weight: bold"><div class="property-title">вывод</div>stdout</div></div><div><p>Для положительного целого числа <span class="tex-span"><i>n</i></span> определим функцию <span class="tex-span"><i>f</i></span>:</p><p><span class="tex-span"><i>f</i>(<i>n</i>) =  - 1 + 2 - 3 + .. + ( - 1)<sup class="upper-index"><i>n</i></sup><i>n</i></span> </p><p>Ваша задача — посчитать <span class="tex-span"><i>f</i>(<i>n</i>)</span> для данного целого числа <span class="tex-span"><i>n</i></span>.</p></div><div class="input-specification"><div class="section-title">Входные данные</div><p>В единственной строке записано положительное целое число <span class="tex-span"><i>n</i></span> (<span class="tex-span">1 ≤ <i>n</i> ≤ 10<sup class="upper-index">15</sup></span>).</p></div><div class="output-specification"><div class="section-title">Выходные данные</div><p>Выведите <span class="tex-span"><i>f</i>(<i>n</i>)</span> в единственной строке.</p></div><div class="sample-tests"><div class="section-title">Примеры</div><div class="sample-test"><div class="input"><div class="title">Входные данные<div title="Скопировать" data-clipboard-target="#id005290013832673798" id="id0022469455827436702" class="input-output-copier">Скопировать</div></div><pre id="id005290013832673798">4<br></pre></div><div class="output"><div class="title">Выходные данные<div title="Скопировать" data-clipboard-target="#id009236879799926495" id="id002392811533840704" class="input-output-copier">Скопировать</div></div><pre id="id009236879799926495">2<br></pre></div><div class="input"><div class="title">Входные данные<div title="Скопировать" data-clipboard-target="#id009136729658489924" id="id0047240266400043096" class="input-output-copier">Скопировать</div></div><pre id="id009136729658489924">5<br></pre></div><div class="output"><div class="title">Выходные данные<div title="Скопировать" data-clipboard-target="#id0015186484523112376" id="id0044615365079112757" class="input-output-copier">Скопировать</div></div><pre id="id0015186484523112376">-3<br></pre></div></div></div><div class="note"><div class="section-title">Примечание</div><p><span class="tex-span"><i>f</i>(4) =  - 1 + 2 - 3 + 4 = 2</span></p><p><span class="tex-span"><i>f</i>(5) =  - 1 + 2 - 3 + 4 - 5 =  - 3</span></p></div>