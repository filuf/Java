import java.util.Arrays;
import java.util.stream.Collectors;

public class dropWhile {
    public static void main(String[] args) {

        //con los métodos takeWhile y dropWhile podemos extraer cierto conjunto de datos
        //o simplemente descartar la parte inicial de algunos datos que no nos interese trabajar con ellos en este momento

        String elQuijote = """
                CAPÍTULO-PRIMERO
                                
                Que trata de la condición y ejercicio del famoso y valiente hidalgoI don Quijote de la Mancha1
                En un lugar de la Mancha2, de cuyo nombre no quiero acordarme3, no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero, adarga antigua, rocín flaco y galgo corredor4. Una olla de algo más vaca que carnero, salpicón las más noches5, duelos y quebrantos los sábados6, lantejas los viernes7, algún palomino de añadidura los domingos8, consumían las tres partes de su hacienda9. El resto della concluían sayo de velarte10, calzas de velludo para las fiestas, con sus pantuflos de lo mesmo11, y los días de entresemana se honraba con su vellorí de lo más fino12. Tenía en su casa una ama que pasaba de los cuarenta y una sobrina que no llegaba a los veinte, y un mozo de campo y plaza que así ensillaba el rocín como tomaba la podadera13. Frisaba la edad de nuestro hidalgo con los cincuenta años14. Era de complexión recia, seco de carnes, enjuto de rostro15, gran madrugador y amigo de la caza. Quieren decir que tenía el sobrenombre de «Quijada», o «Quesada», que en esto hay alguna diferencia en los autores que deste caso escriben, aunque por conjeturas verisímilesII se deja entender que se llamaba «Quijana»III, 16. Pero esto importa poco a nuestro cuento: basta que en la narración dél no se salga un punto de la verdad.
                                
                Es, pues, de saber que este sobredicho hidalgo, los ratos que estaba ocioso —que eran los más del año—, se daba a leer libros de caballerías, con tanta afición y gusto, que olvidó casi de todo punto el ejercicio de la caza y aun la administración de su hacienda; y llegó a tanto su curiosidad y desatino en esto17, que vendió muchas hanegas de tierra de sembradura para comprar libros de caballerías en queIV leer18, y, así, llevó a su casa todos cuantos pudo haber dellos; y, de todos, ningunos le parecían tan bienV como los que compuso el famoso Feliciano de Silva19, porque la claridad de su prosa y aquellas entricadas razones suyas le parecían de perlas, y más cuando llegaba a leer aquellos requiebros y cartas de desafíos20, donde en muchas partes hallaba escrito: «La razón de la sinrazón que a mi razón se hace, de tal manera mi razón enflaquece, que con razón me quejo de la vuestra fermosura»21. Y también cuando leía: «Los altos cielos que de vuestra divinidad divinamente con las estrellas os fortifican y os hacen merecedora del merecimiento que merece la vuestra grandeza...»22
                                
                Con estas razones perdía el pobre caballero el juicio, y desvelábase por entenderlas y desentrañarles el sentido, que no se lo sacara ni las entendiera el mesmo Aristóteles, si resucitara para solo ello. No estaba muy bien con las heridas que don Belianís daba y recebía, porque se imaginaba que, por grandes maestros que le hubiesen curado, no dejaría de tener el rostro y todo el cuerpo lleno de cicatrices y señales23. Pero, con todo, alababa en su autor aquel acabar su libro con la promesa de aquella inacabable aventura, y muchas veces le vino deseo de tomar la pluma y dalle fin al pie de la letra como allí se promete24; y sin duda alguna lo hiciera, y aun saliera con ello25, si otros mayores y continuos pensamientos no se lo estorbaran. Tuvo muchas veces competencia con el cura de su lugar —que era hombre docto, graduado en Cigüenza—26 sobre cuál había sido mejor caballero: Palmerín de Ingalaterra o Amadís de Gaula27; mas maese Nicolás, barbero del mesmo pueblo28, decía que ninguno llegaba al Caballero del Febo, y que si alguno se le podía comparar era don Galaor, hermano de Amadís de Gaula, porque tenía muy acomodada condición para todo, que no era caballero melindroso, ni tan llorón como su hermano, y que en lo de la valentía no le iba en zaga29.
                                
                En resolución, él se enfrascó tanto en su letura, que se le pasaban las noches leyendo de claro en claro30, y los días de turbio en turbio; y así, del poco dormir y del mucho leer, se le secó el celebro de manera que vino a perder el juicio31. Llenósele la fantasía de todo aquello que leía en los libros, así de encantamentos como de pendencias, batallas, desafíos, heridas, requiebros, amores, tormentas y disparates imposibles; y asentósele de tal modo en la imaginación que era verdad toda aquella máquina de aquellas soñadas invencionesVI que leía32, que para él no había otra historia más cierta en el mundo33. Decía él que el Cid Ruy Díaz había sido muy buen caballero, pero que no tenía que ver con el Caballero de la Ardiente Espada, que de solo un revés había partido por medio dos fieros y descomunales gigantes34. Mejor estaba con Bernardo del Carpio, porque en Roncesvalles había muerto a Roldán, el encantado35, valiéndose de la industria de Hércules, cuando ahogó a AnteoVII, el hijo de la Tierra, entre los brazos36. Decía mucho bien del gigante Morgante, porque, con ser de aquella generación gigantea, que todos son soberbios y descomedidos, él solo era afable y bien criado37. Pero, sobre todos, estaba bien con Reinaldos de Montalbán, y más cuando le veía salir de su castillo y robar cuantos topaba, y cuando en allende robó aquel ídolo de Mahoma que era todo de oro, según dice su historia38. Diera él, por dar una mano de coces al traidor de Galalón39, al ama que tenía, y aun a su sobrina de añadidura.
                                
                CAPÍTULO-II
                                
                Que trata de la primera salida que de su tierra hizo el ingenioso don Quijote
                Hechas, pues, estas prevenciones, no quiso aguardar más tiempo a poner en efeto su pensamiento1, apretándole a ello la falta que él pensaba que hacía en el mundo su tardanza,2 según eran los agravios que pensaba deshacer, tuertos que enderezar3, sinrazones que emendar y abusosI que mejorar4 y deudas que satisfacer. Y así, sin dar parte a persona alguna de su intención5 y sin que nadie le viese, una mañana, antes del día, que era uno de los calurosos del mes de julio6, se armó de todas sus armas7, subió sobre Rocinante, puesta su mal compuesta celada, embrazó su adarga8, tomó su lanza y por la puerta falsa de un corral salió al campo9, con grandísimo contento y alborozo de ver con cuánta facilidad había dado principio a su buen deseo. Mas apenas se vio en el campo, cuando le asaltó un pensamiento terrible, y tal, que por poco le hiciera dejar la comenzada empresa; y fue que le vino a la memoria que no era armado caballero y que, conforme a ley de caballería, ni podía ni debía tomar armas con ningún caballero10, y puesto que lo fuera, había de llevar armas blancas11, como novel caballero, sin empresa en el escudo12, hasta que por su esfuerzo la ganase. Estos pensamientos le hicieron titubear en su propósito; mas, pudiendo más su locura que otra razón alguna, propuso de hacerse armar caballero del primero que topase, a imitación de otros muchos que así lo hicieron, según él había leído en los libros que tal le tenían13. En lo de las armas blancas14, pensaba limpiarlas de manera, en teniendo lugar, que lo fuesen más que un arminioII, 15; y con esto se quietó16 y prosiguió su camino, sin llevar otro que aquel que su caballo quería, creyendo que en aquello consistía la fuerza de las aventuras17.
                                
                Yendo, pues, caminando nuestro flamante aventurero, iba hablando consigo mesmo y diciendo:
                                
                —¿Quién duda sino que en los venideros tiempos, cuando salga a luz la verdadera historia de mis famosos hechos, que el sabio que los escribiere no ponga, cuando llegue a contar esta mi primera salida tan de mañana, desta manera?18: «Apenas había el rubicundo Apolo tendido por la faz de la ancha y espaciosa tierra las doradas hebras de sus hermosos cabellos19, y apenas los pequeños y pintados pajarillos con sus harpadas lenguas20 habían saludado con dulce y meliflua armonía la venida de la rosada aurora, que, dejando la blanda cama del celoso marido, por las puertas y balcones del manchego horizonte a los mortales se mostraba21, cuando el famoso caballero don Quijote de la Mancha, dejando las ociosas plumas22, subió sobre su famoso caballo Rocinante y comenzó a caminar por el antiguo y conocido campo de Montiel»23.
                                
                Y era la verdad que por él caminaba. Y añadió diciendo:
                                
                —Dichosa edad y siglo dichoso aquel adonde saldrán a luz las famosas hazañas mías24, dignas de entallarse en broncesIII, 25, esculpirse en mármoles y pintarse en tablas, para memoria en lo futuro. ¡Oh tú, sabio encantador, quienquiera que seas26, a quien ha de tocar el ser coronista27 desta peregrina historia!28 Ruégote que no te olvides de mi buen Rocinante, compañero eterno mío en todos mis caminos y carreras29.
                                
                Luego volvía diciendo, como si verdaderamente fuera enamorado:
                                
                —¡Oh princesa Dulcinea, señora deste cautivo corazón! Mucho agravio me habedes fecho en despedirme y reprocharme con el rigurosoIV afincamiento de mandarme no parecer ante la vuestra fermosura. Plégaos, señora, de membraros deste vuestro sujeto corazón, que tantas cuitas por vuestro amor padece30.
                                
                Con estos iba ensartando otros disparates, todos al modo de los que sus libros le habían enseñado, imitando en cuanto podía su lenguaje. Con estoV, caminaba tan despacio, y el sol entraba tan apriesa y con tanto ardor, que fuera bastante a derretirle los sesos, si algunos tuviera31.
                                
                Casi todo aquel día caminó sin acontecerle cosa que de contar fuese,32 de lo cual se desesperaba, porque quisiera topar luego33 con quien hacer experiencia del valor de su fuerte brazo. Autores hay que dicen que la primera aventura que le avino fue la del Puerto Lápice; otros dicen que la de los molinos de viento34; pero lo que yo he podido averiguar en este caso, y lo que he hallado escrito en los anales de la Mancha35 es que él anduvo todo aquel día, y, al anochecer, su rocín y él se hallaron cansados y muertos de hambre, y que, mirando a todas partes por ver si descubriríaVI algún castillo o alguna majada de pastores donde recogerse36 y adonde pudiese remediar su mucha hambre y necesidadVII, vio, no lejos del camino por donde iba, una venta37, que fue como si viera una estrella que, no a los portalesVIII, sino a los alcázares de su redención le encaminaba38. Diose priesa a caminar y llegó a ella a tiempo que anochecía.
                                
                Estaban acaso39 a la puerta dos mujeres mozas, destas que llaman del partido40, las cuales iban a Sevilla con unos arrieros que en la venta aquella noche acertaron a hacer jornada41; y como a nuestro aventurero todo cuanto pensaba, veía o imaginaba le parecía ser hecho y pasar al modo de lo que había leído, luego que vio la venta se le representó que era un castillo con sus cuatro torres y chapiteles de luciente plata42, sin faltarle su puente levadiza y honda cava43, con todos aquellos adherentes que semejantesIX castillos se pintan. Fuese llegando a la venta que a él le parecía castillo, y a poco trecho della detuvo las riendas a Rocinante, esperando que algún enano se pusiese entre las almenas a dar señal con alguna trompeta de que llegaba caballero al castillo44. Pero como vio que se tardaban y que Rocinante se daba priesa por llegar a la caballeriza, se llegó a la puerta de la venta y vio a las dos destraídas mozas que allí estaban45, que a él le parecieron dos hermosas doncellas o dos graciosas damas que delante de la puerta del castillo se estaban solazando46. En esto sucedió acaso que un porquero que andaba recogiendo de unos rastrojos una manada de puercos (que sin perdón así se llaman)47 tocó un cuerno, a cuya señal ellos se recogen, y al instante se le representó a don Quijote lo que deseaba, que era que algún enano hacía señal de su venida; y, así, con estraño contento48 llegó a la venta y a las damas, las cuales, como vieron venir un hombre de aquella suerte armado, y con lanza y adarga, llenas de miedo se iban a entrar en la venta; pero don Quijote, coligiendo por su huida su miedo,49 alzándose la visera de papelón50 y descubriendo su seco y polvoroso rostro, con gentil talante y voz reposada les dijo:
                                
                —Non fuyanX las vuestras mercedes, ni teman desaguisado alguno, ca a la orden de caballería que profeso non toca ni atañe facerle a ninguno, cuanto más a tan altas doncellas como vuestras presencias demuestran51.
                """;

        //si queremos extraer el segundo capítulo, podríamos hacerlo con dropWhile

        String elQuijoteCap2 = Arrays.stream(elQuijote.split("\n")) //separamos en saltos de línea
                .dropWhile(linea -> !linea.trim().startsWith("CAPÍTULO-II")) // mientras la línea no empiece por "CAPÍTULO-II", descarta
                .collect(Collectors.joining("\n")); //une en un String por saltos de línea

        System.out.println(elQuijoteCap2);
    }
}