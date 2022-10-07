function doDecorator(decorator: Function) {
    console.log("decorator sebelum class");
}

interface doPerkenalan {
    id: number;
    nama: string;
    status: boolean;
}

@doDecorator
class Perkenalan implements doPerkenalan {
    id: number;
    nama: string;
    status: boolean;

    constructor(id: number, nama: string, status: boolean) {
        this.id = id;
        this.nama = nama;
        this.status = status;
    }

    private showIdentity(id : number, nama : string, status : boolean) : void {
        console.log(`ID: ${id}, Nama: ${nama}, Status: ${status}`);
    }

    public showIdentityArray(data: number[]) : void {
        data.forEach((item) => {
            console.log(item);
        });
    }

    public runShowIdentity() : void {
        this.showIdentity(this.id, this.nama, this.status);
    }

}

let perkenalan = new Perkenalan(1, "Habibul", true);
perkenalan.runShowIdentity();
perkenalan.showIdentityArray([1, 2, 3, 4, 5]);