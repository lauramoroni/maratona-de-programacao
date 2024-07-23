#include <iostream>
using namespace std;

struct razao {
	int n, d;
};

razao adicao(razao, razao);
razao sub(razao, razao);
razao prod(razao, razao);
razao divisao(razao, razao);
int mdc(int, int);

int main(){

	razao r1, r2, res;
	int i;
	char op;

	cin >> i;

	for (int k = 0; k < i; k++) {
		cin >> r1.n;
		cin.ignore(3);
		cin >> r1.d;

		cin.ignore(1);
		cin >> op;
		cin.ignore(1);

		cin >> r2.n;
		cin.ignore(3);
		cin >> r2.d;

		switch (op) {
		case '+': res = adicao(r1, r2);
			cout << res.n << "/" << res.d << " = " << res.n/ abs(mdc(res.n, res.d)) << "/" << res.d / abs(mdc(res.n, res.d)) << "\n";
			break;
		case '-': res = sub(r1, r2);
			cout << res.n << "/" << res.d << " = " << res.n / abs(mdc(res.n, res.d)) << "/" << res.d / abs(mdc(res.n, res.d)) << "\n";
			break;
		case '*': res = prod(r1, r2);
			cout << res.n << "/" << res.d << " = " << res.n / abs(mdc(res.n, res.d)) << "/" << res.d / abs(mdc(res.n, res.d)) << "\n";
			break;
		case '/': res = divisao(r1, r2);
			cout << res.n << "/" << res.d << " = " << res.n / abs(mdc(res.n, res.d)) << "/" << res.d / abs(mdc(res.n, res.d)) << "\n";
			break;
		default:
			break;
		}
	}

	return 0;
}

razao adicao(razao r1, razao r2) {
	razao res;

	res.n = (r1.n * r2.d) + (r2.n * r1.d);
	res.d = r1.d * r2.d;

	return res;
}

razao sub(razao r1, razao r2) {
	razao res;

	res.n = (r1.n * r2.d) - (r2.n * r1.d);
	res.d = r1.d * r2.d;

	return res;
}


razao prod(razao r1, razao r2) {
	razao res;

	res.n = r1.n * r2.n;
	res.d = r1.d * r2.d;

	return res;
}

razao divisao(razao r1, razao r2) {
	razao res;

	res.n = r1.n * r2.d;
	res.d = r2.n * r1.d;

	return res;
}

int mdc(int a, int b) {
	/*
	int aux;

	while (a % b > 0) {
		aux = a % b;
		a = b;
		b = aux;
	}

	return b;
	*/

	return (b == 0) ? a : mdc(b, a % b);
}

