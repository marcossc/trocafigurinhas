package Figurinhas;

import java.util.ArrayList;
import java.util.Random;

public class FigurinhasRepo {
    
    private static final ArrayList<Figurinha> figurinhas = new ArrayList<Figurinha>() {{
        add(new Figurinha(0, "DUMMY"));
        add(new Figurinha(1,"Inicial"));
        add(new Figurinha(2,"Inicial"));
        add(new Figurinha(3,"Inicial"));
        add(new Figurinha(4,"Inicial"));
        add(new Figurinha(5,"Inicial"));
        add(new Figurinha(6,"Inicial"));
        add(new Figurinha(7,"Inicial"));
        add(new Figurinha(8,"Estádios"));
        add(new Figurinha(9,"Estádios"));
        add(new Figurinha(10,"Estádios"));
        add(new Figurinha(11,"Estádios"));
        add(new Figurinha(12,"Estádios"));
        add(new Figurinha(13,"Estádios"));
        add(new Figurinha(14,"Estádios"));
        add(new Figurinha(15,"Estádios"));
        add(new Figurinha(16,"Estádios"));
        add(new Figurinha(17,"Estádios"));
        add(new Figurinha(18,"Estádios"));
        add(new Figurinha(19,"Estádios"));
        add(new Figurinha(20,"Cartazes"));
        add(new Figurinha(21,"Cartazes"));
        add(new Figurinha(22,"Cartazes"));
        add(new Figurinha(23,"Cartazes"));
        add(new Figurinha(24,"Cartazes"));
        add(new Figurinha(25,"Cartazes"));
        add(new Figurinha(26,"Cartazes"));
        add(new Figurinha(27,"Cartazes"));
        add(new Figurinha(28,"Cartazes"));
        add(new Figurinha(29,"Cartazes"));
        add(new Figurinha(30,"Cartazes"));
        add(new Figurinha(31,"Cartazes"));
        add(new Figurinha(32,"Rússia"));
        add(new Figurinha(33,"Rússia"));
        add(new Figurinha(34,"Rússia"));
        add(new Figurinha(35,"Rússia"));
        add(new Figurinha(36,"Rússia"));
        add(new Figurinha(37,"Rússia"));
        add(new Figurinha(38,"Rússia"));
        add(new Figurinha(39,"Rússia"));
        add(new Figurinha(40,"Rússia"));
        add(new Figurinha(41,"Rússia"));
        add(new Figurinha(42,"Rússia"));
        add(new Figurinha(43,"Rússia"));
        add(new Figurinha(44,"Rússia"));
        add(new Figurinha(45,"Rússia"));
        add(new Figurinha(46,"Rússia"));
        add(new Figurinha(47,"Rússia"));
        add(new Figurinha(48,"Rússia"));
        add(new Figurinha(49,"Rússia"));
        add(new Figurinha(50,"Rússia"));
        add(new Figurinha(51,"Rússia"));
        add(new Figurinha(52,"Arábia Saudita"));
        add(new Figurinha(53,"Arábia Saudita"));
        add(new Figurinha(54,"Arábia Saudita"));
        add(new Figurinha(55,"Arábia Saudita"));
        add(new Figurinha(56,"Arábia Saudita"));
        add(new Figurinha(57,"Arábia Saudita"));
        add(new Figurinha(58,"Arábia Saudita"));
        add(new Figurinha(59,"Arábia Saudita"));
        add(new Figurinha(60,"Arábia Saudita"));
        add(new Figurinha(61,"Arábia Saudita"));
        add(new Figurinha(62,"Arábia Saudita"));
        add(new Figurinha(63,"Arábia Saudita"));
        add(new Figurinha(64,"Arábia Saudita"));
        add(new Figurinha(65,"Arábia Saudita"));
        add(new Figurinha(66,"Arábia Saudita"));
        add(new Figurinha(67,"Arábia Saudita"));
        add(new Figurinha(68,"Arábia Saudita"));
        add(new Figurinha(69,"Arábia Saudita"));
        add(new Figurinha(70,"Arábia Saudita"));
        add(new Figurinha(71,"Arábia Saudita"));
        add(new Figurinha(72,"Egito"));
        add(new Figurinha(73,"Egito"));
        add(new Figurinha(74,"Egito"));
        add(new Figurinha(75,"Egito"));
        add(new Figurinha(76,"Egito"));
        add(new Figurinha(77,"Egito"));
        add(new Figurinha(78,"Egito"));
        add(new Figurinha(79,"Egito"));
        add(new Figurinha(80,"Egito"));
        add(new Figurinha(81,"Egito"));
        add(new Figurinha(82,"Egito"));
        add(new Figurinha(83,"Egito"));
        add(new Figurinha(84,"Egito"));
        add(new Figurinha(85,"Egito"));
        add(new Figurinha(86,"Egito"));
        add(new Figurinha(87,"Egito"));
        add(new Figurinha(88,"Egito"));
        add(new Figurinha(89,"Egito"));
        add(new Figurinha(90,"Egito"));
        add(new Figurinha(91,"Egito"));
        add(new Figurinha(92,"Uruguai"));
        add(new Figurinha(93,"Uruguai"));
        add(new Figurinha(94,"Uruguai"));
        add(new Figurinha(95,"Uruguai"));
        add(new Figurinha(96,"Uruguai"));
        add(new Figurinha(97,"Uruguai"));
        add(new Figurinha(98,"Uruguai"));
        add(new Figurinha(99,"Uruguai"));
        add(new Figurinha(100,"Uruguai"));
        add(new Figurinha(101,"Uruguai"));
        add(new Figurinha(102,"Uruguai"));
        add(new Figurinha(103,"Uruguai"));
        add(new Figurinha(104,"Uruguai"));
        add(new Figurinha(105,"Uruguai"));
        add(new Figurinha(106,"Uruguai"));
        add(new Figurinha(107,"Uruguai"));
        add(new Figurinha(108,"Uruguai"));
        add(new Figurinha(109,"Uruguai"));
        add(new Figurinha(110,"Uruguai"));
        add(new Figurinha(111,"Uruguai"));
        add(new Figurinha(112,"Portugal"));
        add(new Figurinha(113,"Portugal"));
        add(new Figurinha(114,"Portugal"));
        add(new Figurinha(115,"Portugal"));
        add(new Figurinha(116,"Portugal"));
        add(new Figurinha(117,"Portugal"));
        add(new Figurinha(118,"Portugal"));
        add(new Figurinha(119,"Portugal"));
        add(new Figurinha(120,"Portugal"));
        add(new Figurinha(121,"Portugal"));
        add(new Figurinha(122,"Portugal"));
        add(new Figurinha(123,"Portugal"));
        add(new Figurinha(124,"Portugal"));
        add(new Figurinha(125,"Portugal"));
        add(new Figurinha(126,"Portugal"));
        add(new Figurinha(127,"Portugal"));
        add(new Figurinha(128,"Portugal"));
        add(new Figurinha(129,"Portugal"));
        add(new Figurinha(130,"Portugal"));
        add(new Figurinha(131,"Portugal"));
        add(new Figurinha(132,"Espanha"));
        add(new Figurinha(133,"Espanha"));
        add(new Figurinha(134,"Espanha"));
        add(new Figurinha(135,"Espanha"));
        add(new Figurinha(136,"Espanha"));
        add(new Figurinha(137,"Espanha"));
        add(new Figurinha(138,"Espanha"));
        add(new Figurinha(139,"Espanha"));
        add(new Figurinha(140,"Espanha"));
        add(new Figurinha(141,"Espanha"));
        add(new Figurinha(142,"Espanha"));
        add(new Figurinha(143,"Espanha"));
        add(new Figurinha(144,"Espanha"));
        add(new Figurinha(145,"Espanha"));
        add(new Figurinha(146,"Espanha"));
        add(new Figurinha(147,"Espanha"));
        add(new Figurinha(148,"Espanha"));
        add(new Figurinha(149,"Espanha"));
        add(new Figurinha(150,"Espanha"));
        add(new Figurinha(151,"Espanha"));
        add(new Figurinha(152,"Marrocos"));
        add(new Figurinha(153,"Marrocos"));
        add(new Figurinha(154,"Marrocos"));
        add(new Figurinha(155,"Marrocos"));
        add(new Figurinha(156,"Marrocos"));
        add(new Figurinha(157,"Marrocos"));
        add(new Figurinha(158,"Marrocos"));
        add(new Figurinha(159,"Marrocos"));
        add(new Figurinha(160,"Marrocos"));
        add(new Figurinha(161,"Marrocos"));
        add(new Figurinha(162,"Marrocos"));
        add(new Figurinha(163,"Marrocos"));
        add(new Figurinha(164,"Marrocos"));
        add(new Figurinha(165,"Marrocos"));
        add(new Figurinha(166,"Marrocos"));
        add(new Figurinha(167,"Marrocos"));
        add(new Figurinha(168,"Marrocos"));
        add(new Figurinha(169,"Marrocos"));
        add(new Figurinha(170,"Marrocos"));
        add(new Figurinha(171,"Marrocos"));
        add(new Figurinha(172,"Irã"));
        add(new Figurinha(173,"Irã"));
        add(new Figurinha(174,"Irã"));
        add(new Figurinha(175,"Irã"));
        add(new Figurinha(176,"Irã"));
        add(new Figurinha(177,"Irã"));
        add(new Figurinha(178,"Irã"));
        add(new Figurinha(179,"Irã"));
        add(new Figurinha(180,"Irã"));
        add(new Figurinha(181,"Irã"));
        add(new Figurinha(182,"Irã"));
        add(new Figurinha(183,"Irã"));
        add(new Figurinha(184,"Irã"));
        add(new Figurinha(185,"Irã"));
        add(new Figurinha(186,"Irã"));
        add(new Figurinha(187,"Irã"));
        add(new Figurinha(188,"Irã"));
        add(new Figurinha(189,"Irã"));
        add(new Figurinha(190,"Irã"));
        add(new Figurinha(191,"Irã"));
        add(new Figurinha(192,"França"));
        add(new Figurinha(193,"França"));
        add(new Figurinha(194,"França"));
        add(new Figurinha(195,"França"));
        add(new Figurinha(196,"França"));
        add(new Figurinha(197,"França"));
        add(new Figurinha(198,"França"));
        add(new Figurinha(199,"França"));
        add(new Figurinha(200,"França"));
        add(new Figurinha(201,"França"));
        add(new Figurinha(202,"França"));
        add(new Figurinha(203,"França"));
        add(new Figurinha(204,"França"));
        add(new Figurinha(205,"França"));
        add(new Figurinha(206,"França"));
        add(new Figurinha(207,"França"));
        add(new Figurinha(208,"França"));
        add(new Figurinha(209,"França"));
        add(new Figurinha(210,"França"));
        add(new Figurinha(211,"França"));
        add(new Figurinha(212,"Austrália"));
        add(new Figurinha(213,"Austrália"));
        add(new Figurinha(214,"Austrália"));
        add(new Figurinha(215,"Austrália"));
        add(new Figurinha(216,"Austrália"));
        add(new Figurinha(217,"Austrália"));
        add(new Figurinha(218,"Austrália"));
        add(new Figurinha(219,"Austrália"));
        add(new Figurinha(220,"Austrália"));
        add(new Figurinha(221,"Austrália"));
        add(new Figurinha(222,"Austrália"));
        add(new Figurinha(223,"Austrália"));
        add(new Figurinha(224,"Austrália"));
        add(new Figurinha(225,"Austrália"));
        add(new Figurinha(226,"Austrália"));
        add(new Figurinha(227,"Austrália"));
        add(new Figurinha(228,"Austrália"));
        add(new Figurinha(229,"Austrália"));
        add(new Figurinha(230,"Austrália"));
        add(new Figurinha(231,"Austrália"));
        add(new Figurinha(232,"Peru"));
        add(new Figurinha(233,"Peru"));
        add(new Figurinha(234,"Peru"));
        add(new Figurinha(235,"Peru"));
        add(new Figurinha(236,"Peru"));
        add(new Figurinha(237,"Peru"));
        add(new Figurinha(238,"Peru"));
        add(new Figurinha(239,"Peru"));
        add(new Figurinha(240,"Peru"));
        add(new Figurinha(241,"Peru"));
        add(new Figurinha(242,"Peru"));
        add(new Figurinha(243,"Peru"));
        add(new Figurinha(244,"Peru"));
        add(new Figurinha(245,"Peru"));
        add(new Figurinha(246,"Peru"));
        add(new Figurinha(247,"Peru"));
        add(new Figurinha(248,"Peru"));
        add(new Figurinha(249,"Peru"));
        add(new Figurinha(250,"Peru"));
        add(new Figurinha(251,"Peru"));
        add(new Figurinha(252,"Dinamarca"));
        add(new Figurinha(253,"Dinamarca"));
        add(new Figurinha(254,"Dinamarca"));
        add(new Figurinha(255,"Dinamarca"));
        add(new Figurinha(256,"Dinamarca"));
        add(new Figurinha(257,"Dinamarca"));
        add(new Figurinha(258,"Dinamarca"));
        add(new Figurinha(259,"Dinamarca"));
        add(new Figurinha(260,"Dinamarca"));
        add(new Figurinha(261,"Dinamarca"));
        add(new Figurinha(262,"Dinamarca"));
        add(new Figurinha(263,"Dinamarca"));
        add(new Figurinha(264,"Dinamarca"));
        add(new Figurinha(265,"Dinamarca"));
        add(new Figurinha(266,"Dinamarca"));
        add(new Figurinha(267,"Dinamarca"));
        add(new Figurinha(268,"Dinamarca"));
        add(new Figurinha(269,"Dinamarca"));
        add(new Figurinha(270,"Dinamarca"));
        add(new Figurinha(271,"Dinamarca"));
        add(new Figurinha(272,"Argentina"));
        add(new Figurinha(273,"Argentina"));
        add(new Figurinha(274,"Argentina"));
        add(new Figurinha(275,"Argentina"));
        add(new Figurinha(276,"Argentina"));
        add(new Figurinha(277,"Argentina"));
        add(new Figurinha(278,"Argentina"));
        add(new Figurinha(279,"Argentina"));
        add(new Figurinha(280,"Argentina"));
        add(new Figurinha(281,"Argentina"));
        add(new Figurinha(282,"Argentina"));
        add(new Figurinha(283,"Argentina"));
        add(new Figurinha(284,"Argentina"));
        add(new Figurinha(285,"Argentina"));
        add(new Figurinha(286,"Argentina"));
        add(new Figurinha(287,"Argentina"));
        add(new Figurinha(288,"Argentina"));
        add(new Figurinha(289,"Argentina"));
        add(new Figurinha(290,"Argentina"));
        add(new Figurinha(291,"Argentina"));
        add(new Figurinha(292,"Islândia"));
        add(new Figurinha(293,"Islândia"));
        add(new Figurinha(294,"Islândia"));
        add(new Figurinha(295,"Islândia"));
        add(new Figurinha(296,"Islândia"));
        add(new Figurinha(297,"Islândia"));
        add(new Figurinha(298,"Islândia"));
        add(new Figurinha(299,"Islândia"));
        add(new Figurinha(300,"Islândia"));
        add(new Figurinha(301,"Islândia"));
        add(new Figurinha(302,"Islândia"));
        add(new Figurinha(303,"Islândia"));
        add(new Figurinha(304,"Islândia"));
        add(new Figurinha(305,"Islândia"));
        add(new Figurinha(306,"Islândia"));
        add(new Figurinha(307,"Islândia"));
        add(new Figurinha(308,"Islândia"));
        add(new Figurinha(309,"Islândia"));
        add(new Figurinha(310,"Islândia"));
        add(new Figurinha(311,"Islândia"));
        add(new Figurinha(312,"Croácia"));
        add(new Figurinha(313,"Croácia"));
        add(new Figurinha(314,"Croácia"));
        add(new Figurinha(315,"Croácia"));
        add(new Figurinha(316,"Croácia"));
        add(new Figurinha(317,"Croácia"));
        add(new Figurinha(318,"Croácia"));
        add(new Figurinha(319,"Croácia"));
        add(new Figurinha(320,"Croácia"));
        add(new Figurinha(321,"Croácia"));
        add(new Figurinha(322,"Croácia"));
        add(new Figurinha(323,"Croácia"));
        add(new Figurinha(324,"Croácia"));
        add(new Figurinha(325,"Croácia"));
        add(new Figurinha(326,"Croácia"));
        add(new Figurinha(327,"Croácia"));
        add(new Figurinha(328,"Croácia"));
        add(new Figurinha(329,"Croácia"));
        add(new Figurinha(330,"Croácia"));
        add(new Figurinha(331,"Croácia"));
        add(new Figurinha(332,"Nigéria"));
        add(new Figurinha(333,"Nigéria"));
        add(new Figurinha(334,"Nigéria"));
        add(new Figurinha(335,"Nigéria"));
        add(new Figurinha(336,"Nigéria"));
        add(new Figurinha(337,"Nigéria"));
        add(new Figurinha(338,"Nigéria"));
        add(new Figurinha(339,"Nigéria"));
        add(new Figurinha(340,"Nigéria"));
        add(new Figurinha(341,"Nigéria"));
        add(new Figurinha(342,"Nigéria"));
        add(new Figurinha(343,"Nigéria"));
        add(new Figurinha(344,"Nigéria"));
        add(new Figurinha(345,"Nigéria"));
        add(new Figurinha(346,"Nigéria"));
        add(new Figurinha(347,"Nigéria"));
        add(new Figurinha(348,"Nigéria"));
        add(new Figurinha(349,"Nigéria"));
        add(new Figurinha(350,"Nigéria"));
        add(new Figurinha(351,"Nigéria"));
        add(new Figurinha(352,"Brasil"));
        add(new Figurinha(353,"Brasil"));
        add(new Figurinha(354,"Brasil"));
        add(new Figurinha(355,"Brasil"));
        add(new Figurinha(356,"Brasil"));
        add(new Figurinha(357,"Brasil"));
        add(new Figurinha(358,"Brasil"));
        add(new Figurinha(359,"Brasil"));
        add(new Figurinha(360,"Brasil"));
        add(new Figurinha(361,"Brasil"));
        add(new Figurinha(362,"Brasil"));
        add(new Figurinha(363,"Brasil"));
        add(new Figurinha(364,"Brasil"));
        add(new Figurinha(365,"Brasil"));
        add(new Figurinha(366,"Brasil"));
        add(new Figurinha(367,"Brasil"));
        add(new Figurinha(368,"Brasil"));
        add(new Figurinha(369,"Brasil"));
        add(new Figurinha(370,"Brasil"));
        add(new Figurinha(371,"Brasil"));
        add(new Figurinha(372,"Suíça"));
        add(new Figurinha(373,"Suíça"));
        add(new Figurinha(374,"Suíça"));
        add(new Figurinha(375,"Suíça"));
        add(new Figurinha(376,"Suíça"));
        add(new Figurinha(377,"Suíça"));
        add(new Figurinha(378,"Suíça"));
        add(new Figurinha(379,"Suíça"));
        add(new Figurinha(380,"Suíça"));
        add(new Figurinha(381,"Suíça"));
        add(new Figurinha(382,"Suíça"));
        add(new Figurinha(383,"Suíça"));
        add(new Figurinha(384,"Suíça"));
        add(new Figurinha(385,"Suíça"));
        add(new Figurinha(386,"Suíça"));
        add(new Figurinha(387,"Suíça"));
        add(new Figurinha(388,"Suíça"));
        add(new Figurinha(389,"Suíça"));
        add(new Figurinha(390,"Suíça"));
        add(new Figurinha(391,"Suíça"));
        add(new Figurinha(392,"Costa Rica"));
        add(new Figurinha(393,"Costa Rica"));
        add(new Figurinha(394,"Costa Rica"));
        add(new Figurinha(395,"Costa Rica"));
        add(new Figurinha(396,"Costa Rica"));
        add(new Figurinha(397,"Costa Rica"));
        add(new Figurinha(398,"Costa Rica"));
        add(new Figurinha(399,"Costa Rica"));
        add(new Figurinha(400,"Costa Rica"));
        add(new Figurinha(401,"Costa Rica"));
        add(new Figurinha(402,"Costa Rica"));
        add(new Figurinha(403,"Costa Rica"));
        add(new Figurinha(404,"Costa Rica"));
        add(new Figurinha(405,"Costa Rica"));
        add(new Figurinha(406,"Costa Rica"));
        add(new Figurinha(407,"Costa Rica"));
        add(new Figurinha(408,"Costa Rica"));
        add(new Figurinha(409,"Costa Rica"));
        add(new Figurinha(410,"Costa Rica"));
        add(new Figurinha(411,"Costa Rica"));
        add(new Figurinha(412,"Sérvia"));
        add(new Figurinha(413,"Sérvia"));
        add(new Figurinha(414,"Sérvia"));
        add(new Figurinha(415,"Sérvia"));
        add(new Figurinha(416,"Sérvia"));
        add(new Figurinha(417,"Sérvia"));
        add(new Figurinha(418,"Sérvia"));
        add(new Figurinha(419,"Sérvia"));
        add(new Figurinha(420,"Sérvia"));
        add(new Figurinha(421,"Sérvia"));
        add(new Figurinha(422,"Sérvia"));
        add(new Figurinha(423,"Sérvia"));
        add(new Figurinha(424,"Sérvia"));
        add(new Figurinha(425,"Sérvia"));
        add(new Figurinha(426,"Sérvia"));
        add(new Figurinha(427,"Sérvia"));
        add(new Figurinha(428,"Sérvia"));
        add(new Figurinha(429,"Sérvia"));
        add(new Figurinha(430,"Sérvia"));
        add(new Figurinha(431,"Sérvia"));
        add(new Figurinha(432,"Alemanha"));
        add(new Figurinha(433,"Alemanha"));
        add(new Figurinha(434,"Alemanha"));
        add(new Figurinha(435,"Alemanha"));
        add(new Figurinha(436,"Alemanha"));
        add(new Figurinha(437,"Alemanha"));
        add(new Figurinha(438,"Alemanha"));
        add(new Figurinha(439,"Alemanha"));
        add(new Figurinha(440,"Alemanha"));
        add(new Figurinha(441,"Alemanha"));
        add(new Figurinha(442,"Alemanha"));
        add(new Figurinha(443,"Alemanha"));
        add(new Figurinha(444,"Alemanha"));
        add(new Figurinha(445,"Alemanha"));
        add(new Figurinha(446,"Alemanha"));
        add(new Figurinha(447,"Alemanha"));
        add(new Figurinha(448,"Alemanha"));
        add(new Figurinha(449,"Alemanha"));
        add(new Figurinha(450,"Alemanha"));
        add(new Figurinha(451,"Alemanha"));
        add(new Figurinha(452,"México"));
        add(new Figurinha(453,"México"));
        add(new Figurinha(454,"México"));
        add(new Figurinha(455,"México"));
        add(new Figurinha(456,"México"));
        add(new Figurinha(457,"México"));
        add(new Figurinha(458,"México"));
        add(new Figurinha(459,"México"));
        add(new Figurinha(460,"México"));
        add(new Figurinha(461,"México"));
        add(new Figurinha(462,"México"));
        add(new Figurinha(463,"México"));
        add(new Figurinha(464,"México"));
        add(new Figurinha(465,"México"));
        add(new Figurinha(466,"México"));
        add(new Figurinha(467,"México"));
        add(new Figurinha(468,"México"));
        add(new Figurinha(469,"México"));
        add(new Figurinha(470,"México"));
        add(new Figurinha(471,"México"));
        add(new Figurinha(472,"Suécia"));
        add(new Figurinha(473,"Suécia"));
        add(new Figurinha(474,"Suécia"));
        add(new Figurinha(475,"Suécia"));
        add(new Figurinha(476,"Suécia"));
        add(new Figurinha(477,"Suécia"));
        add(new Figurinha(478,"Suécia"));
        add(new Figurinha(479,"Suécia"));
        add(new Figurinha(480,"Suécia"));
        add(new Figurinha(481,"Suécia"));
        add(new Figurinha(482,"Suécia"));
        add(new Figurinha(483,"Suécia"));
        add(new Figurinha(484,"Suécia"));
        add(new Figurinha(485,"Suécia"));
        add(new Figurinha(486,"Suécia"));
        add(new Figurinha(487,"Suécia"));
        add(new Figurinha(488,"Suécia"));
        add(new Figurinha(489,"Suécia"));
        add(new Figurinha(490,"Suécia"));
        add(new Figurinha(491,"Suécia"));
        add(new Figurinha(492,"Coréia do Sul"));
        add(new Figurinha(493,"Coréia do Sul"));
        add(new Figurinha(494,"Coréia do Sul"));
        add(new Figurinha(495,"Coréia do Sul"));
        add(new Figurinha(496,"Coréia do Sul"));
        add(new Figurinha(497,"Coréia do Sul"));
        add(new Figurinha(498,"Coréia do Sul"));
        add(new Figurinha(499,"Coréia do Sul"));
        add(new Figurinha(500,"Coréia do Sul"));
        add(new Figurinha(501,"Coréia do Sul"));
        add(new Figurinha(502,"Coréia do Sul"));
        add(new Figurinha(503,"Coréia do Sul"));
        add(new Figurinha(504,"Coréia do Sul"));
        add(new Figurinha(505,"Coréia do Sul"));
        add(new Figurinha(506,"Coréia do Sul"));
        add(new Figurinha(507,"Coréia do Sul"));
        add(new Figurinha(508,"Coréia do Sul"));
        add(new Figurinha(509,"Coréia do Sul"));
        add(new Figurinha(510,"Coréia do Sul"));
        add(new Figurinha(511,"Coréia do Sul"));
        add(new Figurinha(512,"Bélgica"));
        add(new Figurinha(513,"Bélgica"));
        add(new Figurinha(514,"Bélgica"));
        add(new Figurinha(515,"Bélgica"));
        add(new Figurinha(516,"Bélgica"));
        add(new Figurinha(517,"Bélgica"));
        add(new Figurinha(518,"Bélgica"));
        add(new Figurinha(519,"Bélgica"));
        add(new Figurinha(520,"Bélgica"));
        add(new Figurinha(521,"Bélgica"));
        add(new Figurinha(522,"Bélgica"));
        add(new Figurinha(523,"Bélgica"));
        add(new Figurinha(524,"Bélgica"));
        add(new Figurinha(525,"Bélgica"));
        add(new Figurinha(526,"Bélgica"));
        add(new Figurinha(527,"Bélgica"));
        add(new Figurinha(528,"Bélgica"));
        add(new Figurinha(529,"Bélgica"));
        add(new Figurinha(530,"Bélgica"));
        add(new Figurinha(531,"Bélgica"));
        add(new Figurinha(532,"Panamá"));
        add(new Figurinha(533,"Panamá"));
        add(new Figurinha(534,"Panamá"));
        add(new Figurinha(535,"Panamá"));
        add(new Figurinha(536,"Panamá"));
        add(new Figurinha(537,"Panamá"));
        add(new Figurinha(538,"Panamá"));
        add(new Figurinha(539,"Panamá"));
        add(new Figurinha(540,"Panamá"));
        add(new Figurinha(541,"Panamá"));
        add(new Figurinha(542,"Panamá"));
        add(new Figurinha(543,"Panamá"));
        add(new Figurinha(544,"Panamá"));
        add(new Figurinha(545,"Panamá"));
        add(new Figurinha(546,"Panamá"));
        add(new Figurinha(547,"Panamá"));
        add(new Figurinha(548,"Panamá"));
        add(new Figurinha(549,"Panamá"));
        add(new Figurinha(550,"Panamá"));
        add(new Figurinha(551,"Panamá"));
        add(new Figurinha(552,"Tunísia"));
        add(new Figurinha(553,"Tunísia"));
        add(new Figurinha(554,"Tunísia"));
        add(new Figurinha(555,"Tunísia"));
        add(new Figurinha(556,"Tunísia"));
        add(new Figurinha(557,"Tunísia"));
        add(new Figurinha(558,"Tunísia"));
        add(new Figurinha(559,"Tunísia"));
        add(new Figurinha(560,"Tunísia"));
        add(new Figurinha(561,"Tunísia"));
        add(new Figurinha(562,"Tunísia"));
        add(new Figurinha(563,"Tunísia"));
        add(new Figurinha(564,"Tunísia"));
        add(new Figurinha(565,"Tunísia"));
        add(new Figurinha(566,"Tunísia"));
        add(new Figurinha(567,"Tunísia"));
        add(new Figurinha(568,"Tunísia"));
        add(new Figurinha(569,"Tunísia"));
        add(new Figurinha(570,"Tunísia"));
        add(new Figurinha(571,"Tunísia"));
        add(new Figurinha(572,"Inglaterra"));
        add(new Figurinha(573,"Inglaterra"));
        add(new Figurinha(574,"Inglaterra"));
        add(new Figurinha(575,"Inglaterra"));
        add(new Figurinha(576,"Inglaterra"));
        add(new Figurinha(577,"Inglaterra"));
        add(new Figurinha(578,"Inglaterra"));
        add(new Figurinha(579,"Inglaterra"));
        add(new Figurinha(580,"Inglaterra"));
        add(new Figurinha(581,"Inglaterra"));
        add(new Figurinha(582,"Inglaterra"));
        add(new Figurinha(583,"Inglaterra"));
        add(new Figurinha(584,"Inglaterra"));
        add(new Figurinha(585,"Inglaterra"));
        add(new Figurinha(586,"Inglaterra"));
        add(new Figurinha(587,"Inglaterra"));
        add(new Figurinha(588,"Inglaterra"));
        add(new Figurinha(589,"Inglaterra"));
        add(new Figurinha(590,"Inglaterra"));
        add(new Figurinha(591,"Inglaterra"));
        add(new Figurinha(592,"Polônia"));
        add(new Figurinha(593,"Polônia"));
        add(new Figurinha(594,"Polônia"));
        add(new Figurinha(595,"Polônia"));
        add(new Figurinha(596,"Polônia"));
        add(new Figurinha(597,"Polônia"));
        add(new Figurinha(598,"Polônia"));
        add(new Figurinha(599,"Polônia"));
        add(new Figurinha(600,"Polônia"));
        add(new Figurinha(601,"Polônia"));
        add(new Figurinha(602,"Polônia"));
        add(new Figurinha(603,"Polônia"));
        add(new Figurinha(604,"Polônia"));
        add(new Figurinha(605,"Polônia"));
        add(new Figurinha(606,"Polônia"));
        add(new Figurinha(607,"Polônia"));
        add(new Figurinha(608,"Polônia"));
        add(new Figurinha(609,"Polônia"));
        add(new Figurinha(610,"Polônia"));
        add(new Figurinha(611,"Polônia"));
        add(new Figurinha(612,"Senegal"));
        add(new Figurinha(613,"Senegal"));
        add(new Figurinha(614,"Senegal"));
        add(new Figurinha(615,"Senegal"));
        add(new Figurinha(616,"Senegal"));
        add(new Figurinha(617,"Senegal"));
        add(new Figurinha(618,"Senegal"));
        add(new Figurinha(619,"Senegal"));
        add(new Figurinha(620,"Senegal"));
        add(new Figurinha(621,"Senegal"));
        add(new Figurinha(622,"Senegal"));
        add(new Figurinha(623,"Senegal"));
        add(new Figurinha(624,"Senegal"));
        add(new Figurinha(625,"Senegal"));
        add(new Figurinha(626,"Senegal"));
        add(new Figurinha(627,"Senegal"));
        add(new Figurinha(628,"Senegal"));
        add(new Figurinha(629,"Senegal"));
        add(new Figurinha(630,"Senegal"));
        add(new Figurinha(631,"Senegal"));
        add(new Figurinha(632,"Colômbia"));
        add(new Figurinha(633,"Colômbia"));
        add(new Figurinha(634,"Colômbia"));
        add(new Figurinha(635,"Colômbia"));
        add(new Figurinha(636,"Colômbia"));
        add(new Figurinha(637,"Colômbia"));
        add(new Figurinha(638,"Colômbia"));
        add(new Figurinha(639,"Colômbia"));
        add(new Figurinha(640,"Colômbia"));
        add(new Figurinha(641,"Colômbia"));
        add(new Figurinha(642,"Colômbia"));
        add(new Figurinha(643,"Colômbia"));
        add(new Figurinha(644,"Colômbia"));
        add(new Figurinha(645,"Colômbia"));
        add(new Figurinha(646,"Colômbia"));
        add(new Figurinha(647,"Colômbia"));
        add(new Figurinha(648,"Colômbia"));
        add(new Figurinha(649,"Colômbia"));
        add(new Figurinha(650,"Colômbia"));
        add(new Figurinha(651,"Colômbia"));
        add(new Figurinha(652,"Japão"));
        add(new Figurinha(653,"Japão"));
        add(new Figurinha(654,"Japão"));
        add(new Figurinha(655,"Japão"));
        add(new Figurinha(656,"Japão"));
        add(new Figurinha(657,"Japão"));
        add(new Figurinha(658,"Japão"));
        add(new Figurinha(659,"Japão"));
        add(new Figurinha(660,"Japão"));
        add(new Figurinha(661,"Japão"));
        add(new Figurinha(662,"Japão"));
        add(new Figurinha(663,"Japão"));
        add(new Figurinha(664,"Japão"));
        add(new Figurinha(665,"Japão"));
        add(new Figurinha(666,"Japão"));
        add(new Figurinha(667,"Japão"));
        add(new Figurinha(668,"Japão"));
        add(new Figurinha(669,"Japão"));
        add(new Figurinha(670,"Japão"));
        add(new Figurinha(671,"Japão"));
        add(new Figurinha(672,"Legends"));
        add(new Figurinha(673,"Legends"));
        add(new Figurinha(674,"Legends"));
        add(new Figurinha(675,"Legends"));
        add(new Figurinha(676,"Legends"));
        add(new Figurinha(677,"Legends"));
        add(new Figurinha(678,"Legends"));
        add(new Figurinha(679,"Legends"));
        add(new Figurinha(680,"Legends"));
        add(new Figurinha(681,"Legends"));
    }};
    
    public static Figurinha buscaFigurinha(int num){
        for(Figurinha f : figurinhas)
            if(f.getNumero() == num)
                return f;
        return null;
    }
    
    public static void adicionaFigurinha(int num, String tipo){
        figurinhas.add(new Figurinha(num, tipo));
    }

    public static ArrayList<Figurinha> lista(){
        return figurinhas;
    }
    
    public static int random(){
        Random r = new Random();
        return r.nextInt(4);
    }
    
    public static String rpad(String valueToPad, String filler, int size) {  
        while (valueToPad.length() < size) {  
            valueToPad = valueToPad+filler;  
        }  
        return valueToPad;  
    }  
    
    public static String lpad(String valueToPad, String filler, int size) {  
        while (valueToPad.length() < size) {  
            valueToPad = filler + valueToPad;  
        }  
        return valueToPad;  
    }
}
