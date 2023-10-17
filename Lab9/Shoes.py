class Shoes:
    def __init__(self, name, size, material):
        self.is_put_on = False
        self.size = size
        self.material = material
        self.lacing_types = ["Hash", "Twistie", "Riding bow", "Lattice", "Zipper"]
        self.lacing = "Hash"
        self.washed = Wash()
        self.repaired = Repair()
        self.name = name
        self.count = 0

        if size > 37:
            self.count += 1

    def start(self):
        if not self.is_put_on:
            self.is_put_on = True
            self.washed.weared()
            self.repaired.weared()
            print("Put on")
        else:
            print("You already put on these shoes")

    def end(self):
        if self.is_put_on:
            self.is_put_on = False
            print("Take off")
        else:
            print("You took off those shoes")

    def show_lacing(self):
        print(f"{self.lacing} lacing")

    def show_material(self):
        print(f"Your shoes are made of {self.material}")

    def change_lacing(self, lacing_type):
        self.lacing = self.lacing_types[lacing_type - 1]
        print(f"The lacing type changed to: {self.lacing}")

    def show_size(self):
        print(f"Shoe size is: {self.size}")

    def show_info(self):
        print(f"Name: {self.name} ; Size: {self.size} ; Material: {self.material}")

    def show_clean(self):
        print(self.washed.is_washed())

    def clean(self):
        return self.washed.clean()

    def show_repair(self):
        print(self.repaired.is_repaired())

    def repair(self):
        return self.repaired.repair1()

    def dispose(self):
        pass  # Release any resources

class Wash:
    def __init__(self):
        self.washed = 100

    def is_washed(self):
        return f"Your shoes are {self.washed}% clean"

    def clean(self):
        self.washed = 100
        return "Your shoes are now clean"

    def weared(self):
        self.washed -= 2
        if self.washed <= 0:
            self.washed = 0

class Repair:
    def __init__(self):
        self.repaired = 100

    def is_repaired(self):
        return f"Your shoes are {self.repaired}% unharmed"

    def repair1(self):
        self.repaired = 100
        return "Your shoes have been repaired"

    def weared(self):
        self.repaired -= 1
        if self.repaired <= 0:
            self.repaired = 0
            print("Your shoes are beyond repair :(")
