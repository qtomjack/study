package com.company.regular.study_application;

import android.content.Context;
import android.graphics.drawable.Drawable;

import java.util.ArrayList;
import java.util.List;

public class Data {

    private List<Integer> mListOfPictures;
    private List<String> mListOfText;
    private List<String> mListOfTitles;

    public Data(Context context) {
        setTitles(context);
        setText(context);
        setPictures(context);
    }

    private void setTitles(Context context) {
        mListOfTitles = new ArrayList<>();
        mListOfTitles.add("Abyssinian");
        mListOfTitles.add("Balinese");
        mListOfTitles.add("Chartreux");
        mListOfTitles.add("Devon Rex");
        mListOfTitles.add("Egyptian Mau");
        mListOfTitles.add("Havana Brown");
    }

    private void setText(Context context) {
        mListOfText = new ArrayList<>();
        //1
        mListOfText.add(
                "Showing cats was all the rage in the late Victorian era. " +
                        "One of the unusual breeds exhibited at the Crystal Palace" +
                        " Cat Show in 1871 was an Abyssinian — “captured in the late " +
                        "Abyssinian War” — who took third place. The report on the cat show, " +
                        "published in the January 27, 1872, issue of Harper’s Weekly, was the " +
                        "first known mention in print of the breed. Unfortunately, no records exist" +
                        " regarding the cats’ origins, although myths and speculation abound, including " +
                        "claims that it was the cat of the pharaohs, and that it was created in Britain" +
                        " by crossing silver and brown tabbies with cats that had “ticked” coats. Today, " +
                        "genetic evidence suggests that the cats came from Indian Ocean coastal regions " +
                        "and parts of Southeast Asia. British and Dutch traders may well have brought the " +
                        "cats from ports such as Calcutta, India, or the islands of Indonesia. A taxidermied " +
                        "specimen of a ruddy ticked cat exhibited in the 1830s at the Leiden Zoological Museum " +
                        "in The Netherlands, where he was labeled “Patrie, domestica India,” gives creedence to that theory. " +
                        "The cats were probably given the name Abyssinian because Zula, the cat exhibited at the Crystal Palace, " +
                        "was said to have been imported from Abyssinia (now Ethiopia). Early pedigrees show crosses to non-Abyssinian cats, w" +
                        "hich may explain the introduction of new coat colors and the gene for long hair. American cat fanciers first imported " +
                        "some Abyssinians in 1900, but Abyssinian breeding programs didn’t get a real start in the United States until the 1930s, " +
                        "when more of the cats were imported from Britain. It’s a good thing that a number of cats were exported to the U.S. because" +
                        " World War II devastated the breed. Only a dozen of the cats had survived in England by the end of the war. " +
                        "The breed bounced back, however, and has become one of the most popular cat breeds."
        );
        //2
        mListOfText.add(
                "Named for the exotically graceful dancers on the Indonesian island of Bali, the Balinese is a longhaired variety of Siamese.  " +
                        "It is unknown whether the long hair is the result of a natural mutation or a cross between the Siamese and a longhaired" +
                        " breed such as a Persian or Turkish Angora. Although longhaired Siamese appeared earlier, the cats did not begin to be " +
                        "developed as a breed until the 1940s and 1950s. The Cat Fanciers Federation recognized the Balinese in 1961, followed by " +
                        "the Cat Fanciers Association in 1970. They are also recognized by the American Cat Fanciers Association and The Internati" +
                        "onal Cat Association, as well as other cat registries. Balinese can be outcrossed to Javanese, Siamese, Colorpoint Shorthai" +
                        "rs and Oriental Longhairs."
        );

        //3
        mListOfText.add(
                "With his cloak of gray fur, sober as a monk’s robes,  it’s no wonder that the Chartreux was associated with the Carthusian order in " +
                        "France. The quiet mousers would have been perfect companions for members of the silent, solitary order. It’s a pretty legend, " +
                        "but there is no real evidence that the cats were kept by the Carthusians, although perhaps they were simply not considered impo" +
                        "rtant enough to mention. A more likely scenario is that the cats, a natural breed, were commonly found in France at least as far" +
                        " back as the 18th century, performing rat patrol in stables, shops and homes. Unfortunately for the beautifully furred felines, " +
                        "they were also prized by furriers for their thick blue pelts. A type of luxurious wool called “pile de Chartreux” may have taken " +
                        "its name from the soft, woolly coated cats. As with so many breeds, however, it’s not really known how the cats came by their name" +
                        " or how or where they were developed. One of the earliest references to a French gray cat dates to 1558, an epitaph for Belaud, who" +
                        " belonged to poet Joachin de Bellay. Bellay describes Belaud “death to rats,” which is certainly an attribute of the breed, then and" +
                        " now. The first reference to the name Chartreux for the blue cats is found in the Universal Dictionary of Commerce, Natural History" +
                        " and the Arts and Trade of Savvary of Brusion, published in 1723, which also mentions the cats’ association with the fur trade. " +
                        "French naturalist George-Louis Leclerc, Comte de Buffon, described them as the cat of France and gave them the Latin name Felis " +
                        "catus coeruleus, meaning blue cat. Free-living groups of the cats lived in Paris and other areas of France until the early 1900s. " +
                        "They were not much valued, except for their skins and their aptitude for vermin control. It wasn’t until after World War I that French" +
                        " cat lovers took steps to preserve the breed. They gathered as many cats as they could and wrote a breed standard. Using only the cat" +
                        "s that met the standard and produced kittens that met it, they were able to begin exhibiting the cats in European shows in either 1928 " +
                        "or 1931, depending on the source. One of the breed’s early adherents was the novelist Colette, whose Chartreux Saha took pride of place" +
                        " in her book La Chatte. General Charles de Gaulle was also known to love the breed, owning one named Gris Gris. It was fortunate that f" +
                        "anciers had begun to breed the Chartreux when they did, because after World War II, none of the free-roaming cats could be found. C" +
                        "hartreux, which are still uncommon, were first imported into the United States in 1970 and were recognized by the Cat Fanciers Associat" +
                        "ion in 1987. Today the cats are recognized by all major American cat associations. The Chartreux is even the official mascot of the Mon" +
                        "treux Jazz Festival. They are less known in Europe, even in their homeland of France. Unlike many cat breeds, they have changed little " +
                        " the years and remain, as Bellay wrote: “the most handsome perhaps That nature ever made in cat’s clothing.”"
        );

        //4
        mListOfText.add(
                "It was first thought that Kirlee, a kitten born in Devon, England, in 1959, shared the same genetic makeup as the Cornish Rex, a breed born a decade" +
                        " earlier in nearby Cornwall, but test breedings soon established that Kirlee was unique, another result of a natural genetic mutation. As " +
                        "suggested by his name, Kirlee had a wavy coat. Little is known of his ancestry. His mother was a stray, and his father was thought to be a" +
                        " roaming tom who also had a curly coat.\n" + "\n" +
                        "Kirlee became the progenitor of a new breed, the Devon Rex, named for his birthplace of Devonshire, as well as his curly coat, which had a texture reminiscent of that of a rex rabbit. Less than a decade later, in 1968, a Devon Rex had emigrated to the United States. The Cat Fanciers Association gave the breed full recognition in 1979.\n"
        );

        //5
        mListOfText.add(
                "Whether the Mau is a product of thousands of years of Egyptian culture is a matter of debate, but if fanciers of the strikingly spotted cats wish to " +
                        "claim that they date to the times of the pharaohs, well, who knows? It could be true. \n" +
                        "\n" +
                        "The Egyptian Mau (mau being the Egyptian word for cat) is notable for being the only naturally spotted domesticated cat. In other words, the " +
                        "spotting pattern was not created by human manipulation of feline genes. The cats were known in Europe before World War II, but the devastation " +
                        "of the war left the breed in a perilous state.\n" +
                        "\n" +
                        "The breed as it is known today dates to a silver female kitten given to Russian princess Natalie Troubetskoy when she was living in Rome. Depend" +
                        "ing on the story, the kitten was given to her by a young boy who had been keeping it in a shoebox or she acquired one from the Egyptian ambassador" +
                        " to Italy. Troubetskoy named the kitten Baba. When she moved to the United States in 1956, Baba and two of her offspring came with her. Troubetskoy wanted to ensure that the Mau survived as a breed, so she wrote a breed standard and began breeding the cats under the cattery name Fatima.\n" +
                        "\n" +
                        "The breed was recognized in 1968 by the Cat Fanciers Federation, followed in 1977 by the Cat Fanciers’ Association. Importation of more Maus in the " +
                        "1980s and again in 1991 increased the breed’s gene pool. Today the breed is recognized by most cat associations.\n"
        );

        //6

        mListOfText.add(
                "How did a brown cat of Southeast Asian origin, believed to offer protection from evil, come to be known as a Swiss Mountain Cat, and how did it then adopt the name Havana Brown? The full answers to those questions are lost to history, but what appears to have happened is that solid-brown cats of Siamese type from Thailand were exhibited in Britain in the 1890s. Somehow during that time they acquired the moniker Swiss Mountain Cat.\n" +
                        "\n" +
                        "In 1920, the Siamese Cat Club of Britain decided that brown cats without blue eyes were no longer desirable, and that was that. Breeders lost interest in them until the 1950s, when a group of British cat breeders set themselves the task of determining the genetic makeup of a self-brown (solid-colored) cat. They eventually produced a male chestnut-brown kitten, the result of a cross between a shorthaiared black cat and a chocolate-point Siamese.\n" +
                        "\n" +
                        "Russian Blues and Burmese may also have played a role in the development of what came to be known as the Havana Brown (whose only connection to Cuba is the supposed resemblance of his color to that of a fine Havana cigar). But as it turned out, according to an article in the 1982 CFA Yearbook, the most successful and most often used breeding to produce a self-brown cat was between a black shorthair and a seal-point Siamese carrying the chocolate gene.\n" +
                        "\n" +
                        "The cats, which also went by the name Chestnut Foreign Shorthair—as many aliases as they had, they might well have been Cold War Cuban spies—were first exported to the United States in the 1950s. It was then that the breed began to go two different ways. In Britain he is now considered to be a brown Oriental Shorthair. In the U.S., he is known as the Havana Brown and has a body and head type that distinguishes him from his British cousin. The Cat Fanciers Association recognized the breed in 1964.\n" +
                        "\n" +
                        "The Havana Brown is a rare breed, so much so that his genetic diversity is threatened. It has been propped up by an outcrossing program begun in 1998, which permits the cats to be bred to unregistered black or blue domestic shorthairs or certain colors of Oriental Shorthairs or chocolate-point or seal-point Siamese. The kittens produced by those breedings can then be bred to Havana Browns. If those kittens have the Havana Brown coloring, they can be registered as Havana Browns.\n" +
                        "\n"
        );
    }

    private void setPictures(Context context) {
        mListOfPictures = new ArrayList<>();
        mListOfPictures.add(R.drawable.abyssinian);
        mListOfPictures.add(R.drawable.balinese);
        mListOfPictures.add(R.drawable.chartreux);
        mListOfPictures.add(R.drawable.devon_rex);
        mListOfPictures.add(R.drawable.egyptian_mau);
        mListOfPictures.add(R.drawable.havana_brown);
    }

    public int getPicture(int position) {
        return mListOfPictures.get(position);
    }

    public String getText(int position) {
        return mListOfText.get(position);
    }

    public String getTitle(int position) {
        return mListOfTitles.get(position);
    }

    public int getLength() {
        return mListOfPictures.size();
    }


}
