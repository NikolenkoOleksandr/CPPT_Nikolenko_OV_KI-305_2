from Shoes import Shoes
class IBoots:
    def take_off_insulation(self):
        pass

    def insulation_on_boots(self):
        pass


class Boots(Shoes, IBoots):
    def __init__(self, name, size, material):
        super().__init__(name, size, material)
        self.insulation = False

    def take_off_insulation(self):
        if self.insulation:
            self.insulation = False
            print("Taking off insulation")
        else:
            print("Insulation is already removed")

    def insulation_on_boots(self):
        if not self.insulation:
            self.insulation = True
        print("The insulation is on")
