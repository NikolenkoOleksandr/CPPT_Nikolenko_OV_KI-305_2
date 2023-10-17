from Boots import Boots

def main():
    try:
        martens = Boots("Dr.Martens 1460", 39, "leather")
        martens.start()
        martens.show_info()
        martens.show_clean()
        martens.insulation_on_boots()
        martens.change_lacing(2)
        martens.show_lacing()
        martens.take_off_insulation()
        martens.show_size()
        martens.end()
        martens.start()
        martens.show_clean()
        martens.show_repair()
        martens.repair()
        martens.show_repair()
        martens.show_material()
        martens.clean()
        martens.end()
        martens.show_clean()
        martens.dispose()
    except Exception as e:
        print(e)

if __name__ == "__main__":
    main()
