var a = 5;
let b = "kampus merdeka";
const nama = "Budi";
let terdaftar = true; // soal 1b
let lengkap_arr = [a, b, nama, terdaftar];

function perkenalan() {
    let asal = "indonesia";
    return console.log(
        "perkenalkan nama saya " +
        nama +
        " nomor urut " +
        a +
        " sekarang sedang mengikuti " +
        b +
        " berasal dari " +
        asal
    );
}

if (terdaftar === true) {
    console.log( nama + " terdaftar sebagai kegiatan kampus merdeka");
}

// console.log("asal diakses = " + asal);

// soal 1a
console.log("array = " + lengkap_arr[2]);

a = b;
console.log("a adalah " + a);
console.log("b adalah " + b);

// soal 1c
perkenalan();


// soal 2a
// karena pada baris 21-23, variabel terdaftar bernilai false

// soal 2b
// karena variabel nama bersifat constanta, sehingga tidak dapat diubah nilainya

// soal 2c
// variabel asal tidak dapat di akses karena variabel asal baru di deklarasikan ketika memanggil function perkenalan()

// soal 3
const foo = ['Budi', 'Sita', 'Ayu'];
const [xa, xb, xc] = foo;

console.log(xa + " " + xb + " " + xc);

// soal 4 
let bdays = ['10-17', '05-19', '20-19'];
let bdays2 = bdays.map((x) => x.replace(/-/, "/"));
console.log(bdays2);

// soal 5
let value = [1, 2, 3, 4, 5, 6];
let multiply = value.map((x) => x * 2);
console.log(multiply);

// soal 6
let arr = [1.5, 2.56, 5.1, 12.33];
let arr2 = arr.map((x) => Math.round(x));
console.log(arr2);