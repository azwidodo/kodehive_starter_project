var angka = [1, 2, 3, 4]

// angka.forEach(item => { console.log(item * item) })
// same thing as:
// angka.forEach(function (item) { console.log(item * item) })

var buku = { judul: "Spring in Action", harga: 360979, penulis: "Craig Walls" }

console.log(buku)

for (item in buku) {
    console.log(item + ": " + buku[item])
}

console.log(isNaN("False"))

function awesomeFunction() {
    var a = 2
    var multiplyBy2 = function () {
        console.log(a * 2)
    }
}

var grand_total = eval("10 * 20 / 2")

console.log(typeof (grand_total))

// var myHobby = {
//     hobby: "football",
//     func: function () {
//         var self = this;
//         document.write("outer func: this.hobby = " + this.hobby + "<br/>")
//         document.write("outer func: this.hobby = " + self.hobby + "<br/>")

//             (function () {
//                 document.write("inner func: this.hobby = " + this.hobby + "<br/>")
//                 document.write("inner func: this.hobby = " + self.hobby)
//             }())

//     }
// }

// myHobby.func()

const person = {
    nama: "sumagusta",
    pet: { nama: "suma" }
}

console.log(person["nama"])