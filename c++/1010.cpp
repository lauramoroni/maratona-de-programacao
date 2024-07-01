#include <iostream>
using namespace std;

struct peca {
    int cod, qntd;
    float valor;
};

int main() {
    struct peca p1, p2;
    float total;

    cin >> p1.cod >> p1.qntd >> p1.valor;
    cin >> p2.cod >> p2.qntd >> p2.valor;

    total = (p1.qntd * p1.valor) + (p2.qntd * p2.valor);

    cout << fixed; cout.precision(2);

    cout << "VALOR A PAGAR: R$ " << total;

    return 0;
}