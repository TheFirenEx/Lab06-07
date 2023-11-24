# Lab06-07
Podstawy Programowania
Lista programów – tablice
Wykorzystując generator liczb pseudolosowych jako źródło danych zrealizować następujące zadania:
T1.
1. Utworzyć w tablicy ciąg N losowych liczb całkowitych z przedziału <1, K> (N < K).
2. Utworzyć w tablicy zbiór N losowych liczb całkowitych z przedziału <1, K> (N < K).
3. wyświetlić ciąg/zbiór w kolejności dopisywania elementów.
4. Wyświetlić ciąg/zbiór w kolejności odwrotnej do kolejności dopisywania elementów.
5. Policzyć ilość liczb parzystych.
6. Policzyć ilość liczb podzielnych przez 9.
7. Policzyć ilość liczb dwucyfrowych.
8. Policzyć sumę wszystkich liczb.
9. Policzyć sumę odwrotności wszystkich liczb.
10. Policzyć iloczyn wszystkich liczb.
11. Policzyć ilość liczb trzycyfrowych podzielnych przez 7.
12. Zapisać do nowej tablicy wszystkie liczby czterocyfrowe, których suma cyfr jest podzielna
przez 3 i przez 7.
13. Podzielić ciąg/zbiór na dwa uporządkowane podciągi/podzbiory: liczb parzystych i liczb
nieparzystych.
Uwaga: w zbiorze elementy nie mogą się powtarzać.
T2. Utworzyć dwie macierze („źródłowe”) liczb rzeczywistych o zadanych rozmiarach M x M (M – dane)
a następnie wyznaczyć:
1. sumę macierzy,
2. iloczyn macierzy,
3. macierze transponowane dla każdej z macierzy źródłowej.
T3. Dla danego zbioru P zawierającego n punktów na płaszczyźnie, w układzie współrzędnych XOY,
wyznacz:
1. punkt najbardziej odległy od początku układu współrzędnych,
2. współrzędne wierzchołków prostokąta o najmniejszym z możliwych polu powierzchni
i bokach równoległych do osi, w którego polu znajdą się wszystkie punkty zbioru P,
3. tabelę odległości pomiędzy wszystkimi możliwymi parami punktów,
4. parę punktów najbardziej odległych od siebie,
5. trójkę punktów tworzących trójkąt o największym polu powierzchni.
Ponadto:
6. uporządkuj zbiór punktów w kolejności rosnących odległości tych punktów od początku
układu współrzędnych,
7. uporządkuj pary punktów w kolejności rosnących odległości pomiędzy nimi.
T4. Dla wielomianu o postaci:
w(x) = a 0 * x n + a 1 * x n-1 + a 2 * x n-2 + ... + a n-1 * x + a n
zaprogramuj następujące funkcjonalności (F) wielofunkcyjnego programu:
1. Wczytanie parametrów wielomianu w(x) (stopnia wielomianu n oraz współczynników
wielomianu) i zapamiętanie ich (w tablicy jednowymiarowej).
2. Wczytanie wartości x (ma być wykonalne tylko wówczas, jeśli wcześniej zrealizowano 1).
3. Wyznaczenie i zapamiętanie wartości wielomianu w dla wczytanego x (wykonalne, jeśli
wcześniej zrealizowano 1 i 2).
4. Wyznaczenie współczynników i stopnia wielomianu v(x) = w(1)(x) (pierwsza pochodna
wielomianu w) i zapamiętanie tych danych jako parametrów wielomianu w(x) (wykonalne, jeśli
wcześniej zrealizowano 1).
5. Wyprowadzenie wyznaczonej wartości wielomianu w(x) (o ile wcześniej wykonano 3 i nie
wykonano potem 1, 2 lub 4).
6. Wyprowadzenie parametrów wielomianu w(x) (wykonalne, jeśli wcześniej zrealizowano 1).
7. Wyznaczenie wartości pierwszej pochodnej wielomianu w(x) dla danego x, korzystając z definicji
pochodnej (wykonalne, jeśli wcześniej zrealizowano 1 i 2).
8. Wyprowadzenie wartości pierwszej pochodnej, wyznaczonej w 7 (wykonalne, jeśli wcześniej
zrealizowano 7 i nie wykonano potem 1 … 6).
Zweryfikuj poprawność uwarunkowań dla poszczególnych funkcji programu. W razie potrzeby
dokonaj stosownej korekty (zmiany, uzupełnienia) zbioru uwarunkowań.
Zadanie dla hobbystów:
T5. Zaproponuj funkcjonalność programu do obsługi zawodów pucharu świata w skokach narciarskich.
Zapewnić:
- możliwość zapisywania zawodników (wprowadzić stosowne górne ograniczenie max>50),
- możliwość przeprowadzenia serii eliminacyjnej – punktacja sędziów: P punktów oraz za każdy
metr powyżej punktu krytycznego K: plus S punktów, za każdy metr poniżej punktu krytycznego
K: minus S punktów, za styl: trzy z pięciu ocen O1 ...O5, które pozostaną po odrzuceniu dwóch
ocen o wartościach skrajnych.
- wyłonienie 50. najlepszych zawodników,
- po 1. serii skoków – wyłonienie 30. najlepszych zawodników do 2. serii,
- po 2. serii skoków – uporządkowanie końcowe.
Wprowadź stosowne dodatkowe założenia (w tym: ograniczenia). 
