import os
import sys
from setuptools import find_packages, setup
from setuptools.command.test import test as TestCommand

import torch
import tkinter as tk
import seaborn as sns



if sys.version_info < (3, 6):
    raise NotImplementedError(" ")


class CustomTestCommand(TestCommand):
    def initialize_options(self):
        TestCommand.initialize_options(self)
        self.test_args = []

    def finalize_options(self):
        TestCommand.finalize_options(self)
        self.test_suite = True

    def run_tests(self):
        
        print("Run...")
        




tensor_a = torch.tensor([1, 2, 3])
tensor_b = torch.tensor([4, 5, 6])
result_tensor = tensor_a + tensor_b
print("PyTorch Tensor Addition Result:", result_tensor)


root = tk.Tk()
root.title("Your GUI App")
label = tk.Label(root, text="Hello, Tkinter!")
label.pack()
root.mainloop()


data = sns.load_dataset("iris")
sns.scatterplot(x="sepal_length", y="sepal_width", hue="species", data=data)
sns.plt.show()
