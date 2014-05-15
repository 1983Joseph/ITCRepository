#include <iostream>
#include <fstream>
using namespace std;
int main(void)
{
    fstream f1;
    fstream f2;
    char *c;
    const char *f1name = "file1.txt";
    const char *f2name = "file2.txt";
    string line1 = "";
    f1.open(f1name);
    f2.open(f2name, ios::ate | ios::in | ios::out);
    if (!f1.is_open() || !f2.is_open()) {
        cerr << "error 1" << endl;
        return 1;
    } else {
        while (getline(f1,line1))
        {
            f2 << "\n" << line1;
        }
        f1.close();
        f2.close();
    }
}
