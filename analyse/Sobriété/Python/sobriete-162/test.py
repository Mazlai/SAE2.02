import sys
sys.path.append('analyse/Sobriété/Python/sobriete-162')
from sobriete162 import bonmot2

@test.describe('Sample tests')
def sample_tests():
    @test.it("bonmot2: ''")
    def test1():
        test.assert_equals(bonmot2(''), '')

    @test.it("bonmot2: '06   07 65 19 70 '")
    def test2():
        test.assert_equals(bonmot2('06   07 65 19 70 '), '06   07651970')

    @test.it("bonmot2: '666, the number of the beast'")
    def test3():
        test.assert_equals(bonmot2('666, the number of the beast'), '666,thenumberofthebeast')

    @test.it("bonmot2: 'Cou cou  J M  B'")
    def test4():
        test.assert_equals(bonmot2('Cou cou  J M  B'), 'Coucou  JM  B')
