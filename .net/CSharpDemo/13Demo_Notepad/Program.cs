namespace _13Demo_Notepad
{
    internal class Program
    {
        static void Main(string[] args)
        {
            SpellCheckerFactory spellCheckerFactory = new SpellCheckerFactory();
            IspellChecker ispellChecker = spellCheckerFactory.GetIspellChecker("english");
            Notepad notepad = new Notepad(ispellChecker);


            notepad.Cut();
            notepad.SpellCheck();

        }




        public interface IspellChecker
        {
            void dospellchecker();
        }

        public class EnglishSpellChecker : IspellChecker
        {
            public void dospellchecker()
            {
                Console.WriteLine("English spell checker is used correctoly");
            }

        }

        public class ChineseSpellChecker : IspellChecker
        {
            public void dospellchecker()
            {
                Console.WriteLine("Chinese Spell checker working fine");
            }
        }

        public class SpellCheckerFactory
        {
            IspellChecker ispell = null;

            public IspellChecker GetIspellChecker(string lang)
            {
                switch (lang)
                {


                    case "english":

                        ispell = new EnglishSpellChecker();
                        break;

                    case "chini":
                        ispell = new ChineseSpellChecker();
                        break;


                    default:
                        ispell = new EnglishSpellChecker();
                        break;

                }

                return ispell;
            }
        }

        public class Notepad
        {

            private IspellChecker _checker;


            public Notepad(IspellChecker checker)
            {
                SpellCheckerFactory spellCF = new SpellCheckerFactory();

                if (checker == null)
                {

                    _checker = spellCF.GetIspellChecker("english");

                }
                else
                {
                    _checker = checker;


                }

            }



                 public void Cut()
            {
                Console.WriteLine("Text Cut functionality done");
            }
            public void Copy()
            {
                Console.WriteLine("Text Copy functionality done");
            }
            public void Paste()
            {
                Console.WriteLine("Text Paste functionality done");
            }

            public void SpellCheck()
            {
                _checker.dospellchecker();
            }

        }
    }
    
}    
